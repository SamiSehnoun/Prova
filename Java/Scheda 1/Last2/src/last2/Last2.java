/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package last2;

import javax.swing.JOptionPane;

/**
 *
 * @author Gio
 */
public class Last2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog("inserire stringa");
        System.out.println("Last2: "+ last2(a));
        }
    public static int last2(String str){
        int cont = 0;
        for(int i = 2; i < str.length()-1; i++){
            if(str.substring(i-2,i).equals(str.substring(str.length()-2, str.length())))
                    cont++;
        }
        return cont;
    }
}
    

