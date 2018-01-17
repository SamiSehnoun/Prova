/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package great6;

import javax.swing.JOptionPane;

/**
 *
 * @author Gio
 */
public class Great6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String c;
        int a;
        int b;
        try{
            c = JOptionPane.showInputDialog("inserire a");
            a = Integer.parseInt(c);
            c = JOptionPane.showInputDialog("inserire b");
            b = Integer.parseInt(c);
        }catch(NumberFormatException err){
            System.out.println("dato non valido");
            return;
        }
        System.out.println(love6(a,b));
        
    }
    
    public static boolean love6(int a, int b){
        if(a == 6 || b== 6 || Math.abs(a-b)==6 || a+b == 6)
            return true;
        return false;
    }
    
}
