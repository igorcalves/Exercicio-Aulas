package MeusTestes.oqsei;

import java.util.Scanner;

public class SistemaMain {
	public static void main(String[] args) {
	
		int operador = 0;
		double numero1 = 0,numero2 = 0;
		
		Operador op = new Operador();
		Scanner entrada = new Scanner(System.in);
		System.out.print("o Primeiro valor para calcular: ");
		numero1 = entrada.nextDouble();
		while(operador != 1 && operador !=2 && operador != 3 && operador != 4) {
			System.out.print("                                 MENU\n\n\n\n\n\n\n\n");
			System.out.print("                                 Escolha:\n\n\n"
					+ "1 = SOMA\n2 = SUBTRACAO\n3 = DIVISAO\n4 = MULTIPLICACAO\nDIGITE O VALOR: ");
			operador = entrada.nextInt();
			
			
			
		}

		System.out.print("o Segundo valor para calcular: ");
		numero2 = entrada.nextDouble();
		op.EscolerOperador(operador, numero1, numero2);
		System.out.println(op.getResultado());
		
		
		
		
		
		
		
		
		
		
		
		
		entrada.close();
	}
}