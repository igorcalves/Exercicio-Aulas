package ControleDesafios;

import java.util.Scanner;

public class DesafioJogoAdvinhacao {
	
	public static void main(String[] args) {
		int i= 10;
		int adv = 80;
		int num = 0;
		Scanner entrada = new Scanner(System.in);
		
		
		do{
			System.out.printf("voce ainda possui %d tentativas\n", i);
			System.out.print("digite o nume para começar a jogar: ");
			num = entrada.nextInt();
			i--;
			
			if(i == 0) {
				break;
			}
			if (num != adv) {
				if (num > adv) {
					System.out.printf("o numero %d é maior digite um menor\n", num);
				}
				else if (num < adv ) {
					System.out.printf("o numero %d é menor digite um numero maior\n", num);
					
					
				}
				
			}
			
			
		
		
		}while (num != adv);
		System.out.printf("parabens o numero de adivinhação é %d e voce digitou %d",adv, num);
		
		entrada.close();
	}

}
