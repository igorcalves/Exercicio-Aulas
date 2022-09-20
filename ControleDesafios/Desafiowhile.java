package ControleDesafios;

import java.util.Scanner;

public class Desafiowhile {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String sair = "";
		while (!sair.equalsIgnoreCase("sair")) {
			System.out.println("digite algo");
			sair = entrada.nextLine();

			
		}
		
		
		
		
		
		entrada.close();
		
	}

}
