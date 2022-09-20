package ControleDesafios;

import java.util.Scanner;

public class DesafioNumeroPrimo
{
	public static void main(String[] args) {
		boolean testando = true;
		Scanner entrada = new Scanner(System.in);
		System.out.print("digite um numeo e descubra se e primo: ");
		int num = entrada.nextInt();
		for (int i = 2; i < num; i++) {
			if (num %i == 0) {
				testando = false;
				
			}	
		}
		if (testando == false ) {
			
		System.out.printf("o numero  %d nao e primo",num);
		}
	
		else {
			System.out.printf("o numero %d e primo",num);
		}
	
	
	
	
	
	
	entrada.close();
	
	
	
}
}
		
		
	