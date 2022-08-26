package Controle;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	String valor  = "";
	do {
		System.out.println("voce precisa falar as palavras magicas");
		System.out.print("quer sair: ");
		valor = entrada.nextLine();
		
	}while (!valor.equalsIgnoreCase("por favor"));
	
	System.out.println("Obrigado");
	
	entrada.close();

	}
}
