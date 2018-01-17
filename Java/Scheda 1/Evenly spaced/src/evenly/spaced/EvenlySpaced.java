/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evenly.spaced;

import javax.swing.JOptionPane;

/**
 *
 * @author Gio
 */
public class EvenlySpaced {

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
        System.out.println(evenlySpaced(a,b,c));
    }
    public static boolean evenlySpaced(int f, int b, int c){
        int a[] = {f,b,c};
        int temp;
        for(int i = 0; i < 3; i++){
            for(int j = i+1; j < 3; j++ ){
                if(a[j] > a[i]){
                    temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
        if(a[0]-a[1] == a[1]-a[2])
            return true;
        return false;
    }
    
}
