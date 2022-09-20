package fundamentos.Desafio;

import java.util.Scanner;

public class DesafioScanner {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("digite o primeiro salário: ");
		String sal1 = entrada.nextLine();
			String c1 = sal1.replace(",", ".");
			double sal11 = Double.parseDouble(c1);
		System.out.print("digite o segundo salário: ");		
			String sal2 = entrada.nextLine();
			String c2 = sal2.replace(",", ".");
			double sal22 = Double.parseDouble(c2);
		System.out.print("digite o terceiro salário: ");
			String sal3 = entrada.nextLine();
			String c3 = sal3.replace(",", ".");
			double sal33 = Double.parseDouble(c3);
			
			Double total = sal11 + sal22 + sal33;
			System.out.println("a media de salário é "+ total/3);
			
			// para efeito de comparação
			
			System.out.println("digita o primeiro salario: ");
			String valor1 = entrada.nextLine().replace(",", ".");
			System.out.println(valor1);
				
		
			
			
			//Scanner.next() TIRA OS ESPAÇOS
			//Scaneer.netxLine() NÃO TIRA OS ESPAÇOES E DEIXA DO JEITO Q VC DIGITOU
			
		
		
		
		
		entrada.close();
		
		
		
		
	}

}
