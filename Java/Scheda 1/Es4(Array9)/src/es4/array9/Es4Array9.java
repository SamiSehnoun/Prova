/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es4.array9;

import javax.swing.JOptionPane;

/**
 *
 * @author Gio
 */
public class Es4Array9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog("inserire lunghezza array");
        int b;
        try{
        b = Integer.parseInt(a);
        }catch(NumberFormatException err){
            System.out.println("non puoi inserire lettere");
            return;
        }
        int[] c = new int[b];
        for(int i = 0; i < b; i++){
            a = JOptionPane.showInputDialog("inserire numero in array");
            try{
                c[i] = Integer.parseInt(a);
            }catch(NumberFormatException err){
                System.out.println("non puoi inserire lettere");
                i--;
            }
            
        }
        System.out.println(arrayFront9(c)+"");
    }
    public static boolean arrayFront9(int[] nums){
        for(int i = 0; i < 4; i++){
        try{   
            if (nums[i]==9)
                return true;
        }catch(IndexOutOfBoundsException a){
            
        }
        }
            
        return false;
    }
    
}
