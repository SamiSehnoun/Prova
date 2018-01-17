/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monkeys;

import javax.swing.JOptionPane;

/**
 *
 * @author Gio
 */
public class Monkeys {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]){
    String input;
    boolean a = false;
    boolean b = false;
    input = JOptionPane.showInputDialog("inserire true se la scimmia a sta sorridendo");
    if (input.equals("True") || input.equals("true"))
        a = true;
    input = JOptionPane.showInputDialog("inserire true se la scimmia b sta sorridendo");
    if (input.equals("True") || input.equals("true"))
        b = true;
    if (a && b)
        System.out.println("true");
    else
        System.out.println("false");
    }

}