package ControleDesafios;

import java.util.Scanner;

public class DesafioAnoBiessexto {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("digite o ano: ");
		int ano = entrada.nextInt();
		
		if (ano %4==0) {
			System.out.printf("o %d e bissexto",ano);
			
		}
		else
			System.out.printf("o %d nao e bissexto", ano);

		entrada.close();
	}
}
