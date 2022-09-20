package MeusTestes;

import java.util.Scanner;

public class nomeCompleto {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("digite eu nome: ");
		String nome = entrada.next().replace("i", "I");
		System.out.print("digite seu sobrenome : ");
		String sobrenome = entrada.next();
		System.out.printf("seu nome e : %s %s",nome , sobrenome);
	
		entrada.close();
	}

}
