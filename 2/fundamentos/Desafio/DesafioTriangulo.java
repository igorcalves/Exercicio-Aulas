package fundamentos.Desafio;

import java.util.Scanner;

public class DesafioTriangulo {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("digite a altura: ");
		Double altura = entrada.nextDouble();
		System.out.print("digite a base: ");
		Double base = entrada.nextDouble();
		Double area = (base * altura) / 2 ;
		System.out.printf("a area do triangulo e %.2f cm : ", area);
		
		
		entrada.close();
	}

}
