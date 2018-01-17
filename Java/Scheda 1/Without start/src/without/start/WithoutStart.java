/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package without.start;

import javax.swing.JOptionPane;

/**
 *
 * @author Gio
 */
public class WithoutStart {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog("inserire stringa a");
        String b = JOptionPane.showInputDialog("inserire stringa b");
        System.out.println(nonStart(a,b));
    }
    public static String nonStart(String a, String b){
        String c = "";
        try{
        c = a.substring(1,a.length()) + b.substring(1, b.length());
        }catch(StringIndexOutOfBoundsException err){
            System.out.println("lunghezza stringhe insufficiente");
        }
        return c;
    }
}
