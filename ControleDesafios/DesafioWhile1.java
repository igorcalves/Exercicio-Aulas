package ControleDesafios;

import java.util.Scanner;

public class DesafioWhile1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int nota = 0, total = 0,div = 0;
		while (nota != -1){
			System.out.print("digite a nota: ");
			nota = entrada.nextInt();
				if (nota >= 0 && nota <= 10){
					total = total + nota;
					div++;
				}else if (nota != -1) {
					System.out.printf("o valor de %d e menor que 0 ou maior que 10\n", nota);
				}
		}
		
		System.out.printf("nota total = %d media = %d \na quantidade de notas validas foram %d", total, total/div, div);
			


		entrada.close();
	}
}
    