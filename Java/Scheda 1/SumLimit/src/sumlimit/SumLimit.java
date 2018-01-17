/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumlimit;

import javax.swing.JOptionPane;

/**
 *
 * @author Gio
 */
public class SumLimit {

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
        System.out.println(sumLimit(Math.abs(a),Math.abs(b)));
    }
    public static int sumLimit(int a, int b){
        int c = a+b;
        String sa = String.valueOf(a);
        String sc = String.valueOf(c);
        if(sa.length() == sc.length())
            return c;
        return a;
        
    }
    
}
