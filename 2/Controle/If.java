package Controle;

import java.util.Scanner;
import java.util.Locale;

public class If {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		entrada.useLocale(Locale.ENGLISH);
		System.out.print("informe a media: ");
		double media = entrada.nextDouble();
		if (media <= 10 && media >= 7.0) 
		
		{
			System.out.println("Aprovado");
			System.out.println("Parabens");
			
		}
		if (media < 7 && media >= 4.5) {
			System.out.println("recuperação");
		}
		
		if (media < 4.5 && media >= 0 ) {
			System.out.println("Reprovado");
			
		}
		
		entrada.close();
	}

}
