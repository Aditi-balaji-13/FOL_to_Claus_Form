/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package krr.main;

import java.io.File;

/**
 *
 * @author baskaran
 */
public class Tool {

    private static void usage() {
        System.out.printf("Usage:\n      java krr.main.Tool <-FOL/-HC/-PSYS/-DL/-MAN> [-DEBUG] file-1 file-2 ... file-N\n");
        System.out.printf("Example:\n    java krr.main.Tool -FOL fol.txt -HC hc.txt\n");
        System.out.printf("Example:\n    java krr.main.Tool -FOL -DEBUG fol.txt -HC -DEBUG hc.txt\n");
    }
    public static void main(String[] args) {
        Process process=null;
        if (args.length > 0) {
            for(String arg : args) {
                if (arg.equalsIgnoreCase("-FOL")) {
                    process = ProcessFOL.getInstance();
                }
                else if (arg.equalsIgnoreCase("-HC")) {
                    process = ProcessHC.getInstance();
                }
                else if (arg.equalsIgnoreCase("-PSYS")) {
                    process = ProcessPSYS.getInstance();
                }
                else if (arg.equalsIgnoreCase("-DL")) {
                    process = ProcessDL.getInstance();
                }
                else if (arg.equalsIgnoreCase("-MAN")) {
                    process = ProcessMAN.getInstance();
                }
                else if (arg.equalsIgnoreCase("-DEBUG")) {
                    if (process != null) process.debug();
                }
                else {
                    if (process != null) {
                        File f = new File(arg);
                        if(f.isFile()) {
                            process.run(arg);
                        }
                        else {
                            System.err.printf("Input not found: %s\n", arg);
                        }
                    }
                }
            }
        }
        else {
            usage();
        }
    }
}
