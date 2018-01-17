/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lucky.sum;

import javax.swing.JOptionPane;

/**
 *
 * @author Gio
 */
public class LuckySum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String d;
        int a;
        int b;
        int c;
        try{
            d = JOptionPane.showInputDialog("inserire a");
            a = Integer.parseInt(d);
            d = JOptionPane.showInputDialog("inserire b");
            b = Integer.parseInt(d);
            d = JOptionPane.showInputDialog("inserire c");
            c = Integer.parseInt(d);
        }catch(NumberFormatException err){
            System.out.println("dato non valido");
            return;
        }
        System.out.println(luckySum(a,b,c));
    }
    public static int luckySum(int a, int b, int c){
        int somma = 0;
        int []array = {a,b,c};
        for(int i = 0; i < 3; i++){
            if (array[i] == 13)
                return somma;
            somma += array[1];
        }
        return somma;
    }
    
}
