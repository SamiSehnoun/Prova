/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oz;

import javax.swing.JOptionPane;

/**
 *
 * @author Gio
 */
public class Oz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog("inserire stringa");
        System.out.println(startOz(a));
	
    
    }
    
    public static String startOz(String a){
		String b="";
                if(a.length() != 0)
                    if(a.charAt(0) == 'o' || a.charAt(0) == 'O')
			b = a.charAt(0) + "";
                if(a.length() >= 2)
                    if(a.charAt(1) == 'z' || a.charAt(1) == 'z')
			b += a.charAt(1);
		return b;
	}
    
}
