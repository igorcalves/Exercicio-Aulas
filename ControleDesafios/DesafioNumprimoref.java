package ControleDesafios;

import java.util.Scanner;

public class DesafioNumprimoref {
	public static void main(String[] args) {
		int testando = 0;
		Scanner entrada = new Scanner(System.in);
		System.out.print("digite um numeo e descubra se e primo: ");
		int num = entrada.nextInt();
		for (int i = 2; i < num; i++) {
			if (num %i == 0) {
				testando = 1;}	
		}

	switch (testando) {
	case 0:
		System.out.printf("o numero %d e primo", num);
		break;
	case 1:
		System.out.printf("o nume %d nao e primo", num);
		break;

	}
	
	
	
	
	entrada.close();
	
	
	
}

	
}

