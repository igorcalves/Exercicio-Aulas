package ControleDesafios;

import java.util.Locale;
import java.util.Scanner;

public class DesafioDiasSemana {
	public static void main(String[] args) {
		Scanner E = new Scanner(System.in);
					E.useLocale(Locale.ENGLISH);
		System.out.print("Digite o dia da semana: ");
		String D = E.nextLine().toLowerCase();
		if (D.equals("segunda feira")) 
			{System.out.println("1");}
		else if (D.equals("terça feira")) 
		{System.out.println("2");} 
		
		else if (D.equals("quarta feira")) 
		{System.out.println("3");} 
		
		else if (D.equals("quinta feira")) 
		{System.out.println("4");} 
		
		else if (D.equals("sexta feira")) 
		{System.out.println("5");} 
		
		else if (D.equals("sabado")) 
		{System.out.println("6");} 
		else if (D.equals("domingo")) 
		{System.out.println("7");} 
		
		else {
			System.out.println("nao e um dia da semana");
		}
			
			
			
			
			
			
			
			
			
			E.close();
		
	}

}
