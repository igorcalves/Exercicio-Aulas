package fundamentos.Desafio;

import java.util.Scanner;

public class grausFtoC {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("digite o valor em F :");
		
		Double f = entrada.nextDouble();
		Double c = (f - 32)/ 1.8;
		
		System.out.printf("%.2f Fahrenheit e igual a %.2f Celcius", f,c);
		
		
		
		entrada.close();
		
	}
}
