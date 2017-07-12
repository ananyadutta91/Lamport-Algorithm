//  Main method for application.
package LamportAlgorithm;
class Lamport {
   public static void main(String[] args) {
     Screen.isApplication = true;
     String s0 = "", s1 = "";
     WaitObject waitObject = new WaitObject();
     if (args.length >= 1) s0 = args[0].toLowerCase();
     if (args.length >= 2) s1 = args[1];
     while (true) {
       new Screen(s0, s1, waitObject);
       waitObject.waitOK();
       s0 = ""; s1 = ""; // Arguments only for first execution 
     }
   }
}
