/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio4;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author EmaGio
 */
public class Esercizio4 {

    /**
     * @param args the command line arguments
     */
    public static Pentola p1;
    public static int p;
    public static void main(String[] args) {
        System.out.println("inserire numero di porzioni");
        Scanner sc = new Scanner(System.in);
        p = sc.nextInt();
        p1 = new Pentola(p);
            Thread1 selvaggio = new Thread1();
            Cuoco cuoco = new Cuoco();
            selvaggio.start();
            cuoco.start();
            
    }
    public static class Thread1 extends Thread implements Runnable{
        public void run(){
            while(true){
                if(p1.porzioni != 0){
            p1.porzioni--;
                try {
                    sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Esercizio4.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println("un selvaggio ha preso una porzione\nporzioni rimanenti:"+ p1.porzioni+"\n\n");
            }/*
                Cuoco cuoco = new Cuoco();
                cuoco.start();
                try {
                    cuoco.join();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Esercizio4.class.getName()).log(Level.SEVERE, null, ex);
                }*/
            }
        }
    }
    public static class Cuoco extends Thread implements Runnable{
        public void run(){
            while (true){
                try {
                    sleep(900);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Esercizio4.class.getName()).log(Level.SEVERE, null, ex);
                }
                if(p1.porzioni == 0){
                    System.out.println("\n-------------\nporzioni ricaricate\n-----------------------\n");
                    p1.porzioni = p;
                }
            }
            }
            
        }
    
}

