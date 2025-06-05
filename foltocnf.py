#!/usr/bin/env python
# coding: utf-8

# In[1]:


#importing packages
import os
import copy as cp
import lxml.etree as ET

#converting input txt to xml using parser

JARS='dist/KRR.jar:lib/antlr-3.5.2-runtime.jar'
inputtxt='1.txt' #enter input file name here 
inputxml='1.xml' #enter required xml file which is used by the program as input to convert to cnf form
os.system("java -cp "+JARS+" krr.main.Tool -FOL  input/"+ inputtxt +" 1>input/"+inputxml)


# In[2]:


tree = ET.parse('./input/'+inputxml)
root=tree.getroot()
for j in root:
    for i in j.iter('IFF'): #we replace Double implication statements as implies and implied by
        l=i.getchildren()
        print(l)
        for k in l:
            i.remove(k)
        i.tag='AND'
        ET.SubElement(i,'IMPLIEDBY')
        i.find('IMPLIEDBY').extend(l)
        i.append(cp.deepcopy(i.find('IMPLIEDBY')))
        i.find('IMPLIEDBY').tag='IMPLIES'
    for i in j.iter('IMPLIEDBY'): #we replace implied by statement as back to imply
        l=i.getchildren()
        for k in l:
            i.remove(k)
        l.reverse()
        i.extend(l)
        i.tag='IMPLIES' 
    for i in j.iter('IMPLIES'): # implies statement is converted to cnf form with not and or operators
        l=i.getchildren()
        for k in l:
            i.remove(k)
        ET.SubElement(i,'NOT')
        i.find('NOT').append(l[0])
        i.append(l[1])
        i.tag='OR'
    f=0
    for i in j.iter('NOT'):   
        if(i.find('FORALL')):  #the not operator in front of universal quantifier makes it existential
            l=i.find('FORALL').getchildren()
            for k in l[1:]:
                i.find('FORALL').remove(k)
            ET.SubElement(i.find('FORALL'),'NOT')
            i.find('FORALL').find('NOT').extend(l[1:])
            i.find('FORALL').tag='EXISTS'
        elif(i.find('EXISTS')): #not operator in front of existential quantifier makes it universal 
            l=i.find('EXISTS').getchildren()
            for k in l[1:]:
                i.find('EXISTS').remove(k)
            ET.SubElement(i.find('EXISTS'),'NOT')
            i.find('EXISTS').find('NOT').extend(l[1:])
            i.find('EXISTS').tag='FORALL'
        x=i.getparent()
        p=i.getchildren()
        f=0
        for z in p:         #not operator moves inside the bracket until it faces a predicate
            if(z.tag=='PREDICATE'):
                f=1
        if (f!=1):
            x.remove(i)
            x.extend(p)
    
        
            


# In[3]:



for j in root:
    fl=0
    while(fl<2):
        for i in j.iter('NOT'):
            f=0
            if(i.find('AND')): #not operator changes and to or
                k3=i.find('AND')
                l=k3.getchildren()
                for a in l:
                    k3.remove(a)
                k3.tag='OR'
                ET.SubElement(k3,'NOT')
                k3.find('NOT').append(l[0])
                ET.SubElement(k3,'NOT')
                k3.findall('NOT')[-1].append(l[1])
                f=1
            elif(i.find('OR')): #or to and
                k4=i.find('OR')
                l=k4.getchildren()
                for a in l:
                    k4.remove(a)
                k4.tag='AND'
                ET.SubElement(k4,'NOT')
                k4.find('NOT').append(l[0])
                ET.SubElement(k4,'NOT')
                k4.findall('NOT')[-1].append(l[1])
                f=1
            if(f==1):
                x=i.getparent()
                p=i.getchildren()
                x.remove(i)
                x.extend(p)
        if(f==0):
            for k in j.iter('NOT'):
                if(k.find('AND') or k.find('OR')):
                    f=1
        fl+=1
            


# In[4]:


for j in root:
    fl=0
    while(fl<2):
        for i in j.iter('NOT'): #negation composed over itself twice results in the same predicate without negation
            f=0
            if(i.find('NOT')):
                i1=i.find('NOT')
                x=i1.getparent()
                p=i1.getchildren()
                x.remove(i1)
                x.extend(p)
                f=1
            if(f==1):
                x=i.getparent()
                p=i.getchildren()
                x.remove(i)
                x.extend(p)
        fl+=1

            


# In[5]:


count=0                               #standardize variables with different names to distinguish between different 
for j in root:                        #sentences
    for i in j.iter('VARIABLE'):
        i.text=i.text+'_'+str(count)
    count+=1      


# In[6]:


for j in root:                               #skolemize variables
    li=[]
    for i in j.iter('EXISTS'):
        for m in i.iterancestors('FORALL'):
                    if(m.find('VARLIST')):
                        for z in m.find('VARLIST'):
                            for t in z.find('VARIABLE'):
                                li.append(t.text)
                    else:       
                        o=list(m.iter('VARIABLE'))[0]
                        li.append(o.text)
        if( not list(i.iterancestors('FORALL'))):
            print('y1')
            for n in i.iter('VARIABLE'):
                if (n.text not in li):
                    n.text='sk_'+n.text
           
        else:                                                 #skolem functions
            for n in i.iterdescendants('VARIABLE'):
                if (n.text not in li):
                    n.text='sk_'+n.text+'('+','.join(li)+')'
        x=i.getparent()
        chil=i.getchildren()[1:]
        x.remove(i)
        x.extend(chil)

for j in root:                                             # 
    for i in j.iter('FORALL'):
        x=i.getparent()
        chil=i.getchildren()[1:]
        x.remove(i)
        x.extend(chil)


# In[7]:



def Parsers(j):                                            #parser to change xml output to text form 
    if(j.tag=="PREDICATE"):
      
        li=[]
        for k in j.getchildren():
                
                li.append(k.text)
                
        return j.get('name')+'('+','.join(li)+')'

    if(j.tag=="NOT"):                                
        currString=Parsers(j.getchildren()[0])
        return "~("+currString+")"

    if(j.tag=="AND"):
        currString1=Parsers(j.getchildren()[0])
        currString2=Parsers(j.getchildren()[1])
        return '('+currString1+") and ("+currString2+")"
    if(j.tag =="OR"):
        currstring3=Parsers(j.getchildren()[0])
        currString4=Parsers(j.getchildren()[1])
        return "(" + currstring3+ ") or ("+currString4+")"
f = open('./output/'+inputtxt.replace('.txt','')+'_output.txt','w')
for j in root:   
    f.write(str(Parsers(j)))    
    f.write('\n')
f.close()


# In[8]:


tree.write('output/'+inputxml.replace('.xml','')+'_output.xml') 

