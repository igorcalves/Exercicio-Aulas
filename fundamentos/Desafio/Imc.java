package fundamentos.Desafio;

import java.util.Scanner;

public class Imc {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);	
		System.out.print("Digite seu peso: ");
		Double peso = entrada.nextDouble();
		System.out.print("digite sua altura: ");
		String altura = entrada.next();
		String aa = altura = altura.replace(",", ".");
		Double alturax = Double.parseDouble(aa);
		//Double alturax = Double.parseDouble(altura.replace(",", "."));
		double IMC = peso / (alturax * alturax);
		System.out.printf("voce pesa %.2f e tem %.2f de altura \nseu IMC e : %.2f ", peso, alturax, IMC);
		
		
		
		entrada.close();
		
	
	}
}
