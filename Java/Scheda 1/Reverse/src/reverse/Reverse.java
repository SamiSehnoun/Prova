/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reverse;

import javax.swing.JOptionPane;

/**
 *
 * @author Gio
 */
public class Reverse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] a = new int [3];
        String b;
        for(int i = 0; i < 3; i++){
            try{
            b = JOptionPane.showInputDialog("inserire numero");
            a[i] =Integer.parseInt(b);
            }catch(NumberFormatException err){
                i--;
                System.out.println("reinserire un valore valido");
            }
        }
        a = reverse3(a);
        for(int i = 0; i < 3; i++)
            System.out.println(a[i]);
    }
    public static int[] reverse3(int[] n){
        int[] a = new int [3];
        int j = 2;
        for(int i = 0; i < 3;i++){
            a[j] = n[i];
            j--;
        }
        return a;
    }
    
}
