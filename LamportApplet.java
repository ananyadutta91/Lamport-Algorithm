package LamportAlgorithm;
import javax.swing.*;
public class LamportApplet extends JApplet {
//  Init method for applet
	public void init() {
    Screen.isApplication = false;
    String s0 = getParameter("alg");
    String s1 = getParameter("number");
    WaitObject waitObject = new WaitObject();
    if (s0 == null) s0 = ""; else s0 = s0.toLowerCase();
    if (s1 == null) s1 = "";
     while (true) {
       new Screen(s0, s1, waitObject);
       waitObject.waitOK();
       s0 = ""; s1 = ""; // Arguments only for first execution 
     }
   }
}
