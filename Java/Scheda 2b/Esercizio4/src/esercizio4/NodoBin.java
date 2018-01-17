/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio4;

/**
 *
 * @author Gio
 */
public class NodoBin {
	int valore;
	NodoBin sin;
	NodoBin des;
	
	public NodoBin(int val, NodoBin s, NodoBin d) {
		valore = val;
		sin = s;
		des = d;
	}
}