package ControleDesafios;

import java.util.Scanner;

public class DesafioNumeroPositivo {
	
		public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
			int i = 0;
			int num = 0;
			do{
			    System.out.printf("Digite um valor positivo: ");
			    i = entrada.nextInt();
			    if (i >=0){
			    num+= i;
			    }
			}while(i >= 0);
			System.out.printf("a soma e todos numeros deu %d ", num);
		entrada.close();
		}
		

}
