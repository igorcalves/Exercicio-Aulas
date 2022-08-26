package ControleDesafios;

import java.util.Scanner;

public class Desafionotas {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("digite o valor 1 da nota ");
		Double n1 = entrada.nextDouble();
		System.out.print("digite o valor 2 da nota ");
		Double n2 = entrada.nextDouble();
		Double media = (n1 + n2) /2 ;
		
		if(media >= 7) {
			System.out.print("Aprovado");
			
		}
		else if (media < 7 && media > 4) {
			System.out.print("Recuperacao");
		}
		else {
			System.out.print("Reprovado");
		}
		
		entrada.close();
		
		
	}
}
