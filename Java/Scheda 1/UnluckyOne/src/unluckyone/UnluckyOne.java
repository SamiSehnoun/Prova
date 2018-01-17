/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unluckyone;

import javax.swing.JOptionPane;

/**
 *
 * @author Gio
 */
public class UnluckyOne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String b;
        int n;
        try{
            b = JOptionPane.showInputDialog("inserire lunghezza array");
            n = Integer.parseInt(b);
        }catch(NumberFormatException err){
            System.out.println("dato non valido");
            return;
        }
        
        int[] a = new int [n];
        for(int i = 0; i < n; i++){
            try{
            b = JOptionPane.showInputDialog("inserire numero");
            a[i] =Integer.parseInt(b);
            }catch(NumberFormatException err){
                i--;
                System.out.println("reinserire un valore valido");
            }
        }
        System.out.println(unlucky1(a));
    }
    public static boolean unlucky1(int[] a){
        int n = 0;
        for(int i = 1; true; i++){
            try{
            if (a[i] == 3 && a[i-1] == 1)
                return true;
            }catch(IndexOutOfBoundsException err){
                return false;
            }
        }
    }
    
}
