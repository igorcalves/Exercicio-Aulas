package Controle;

import javax.swing.JOptionPane;

public class IfELse {
	public static void main(String[] args) {
		String valor = JOptionPane.showInputDialog("infomre o numero: ");
		
		int numero = Integer.parseInt(valor);
		
		if (numero % 2 == 0 ) {
			System.out.printf("o numero %d e par", numero);
			}
		else {
			System.out.printf("o numero %d e impar", numero);
		}
	}
}
