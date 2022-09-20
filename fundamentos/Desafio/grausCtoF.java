package fundamentos.Desafio;

import java.util.Scanner;

public class grausCtoF {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("digite o valor em C :");
		
		Double c = entrada.nextDouble();
		Double f = c * 1.8 +32;
		
		System.out.printf("%.2f Celcius e igual a %.2f Fahrenheit", c,f);
		
		
		
		entrada.close();
		
	}

}
