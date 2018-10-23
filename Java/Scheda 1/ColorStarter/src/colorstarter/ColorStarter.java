/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colorstarter;

import javax.swing.JOptionPane;

/**
 *
 * @author Gio
 */
public class ColorStarter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(seeColor(JOptionPane.showInputDialog("inserire colore")));
    }
    public static String seeColor(String a){
        try{
        if(a.substring(0,3).equals("red"))
            return "red";
        else if (a.substring(0,4).equals("blue"))
            return "blue";
        }catch(StringIndexOutOfBoundsException err){
            system.out("ciao");
        }
        return "";
        
    }
    
}
