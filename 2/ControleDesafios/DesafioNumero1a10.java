package ControleDesafios;

import java.util.Scanner;

public class DesafioNumero1a10 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("digite um valor: ");
		int num = entrada.nextInt();
		
		if (num >=0 && num <= 10) {
			System.out.printf("%d esta entre 0 e 10\n", num);
			if (num %2==0) {
				System.out.printf("%d e par", num);
			}
			else {
				System.out.printf("%d nao e par", num);
				
			} 
			
			
			
		}
		else{
			System.out.printf("%d n esta entre 0 e 10",num);
		}
		
		
		entrada.close();
	}
}
