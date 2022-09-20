package fundamentos;

import java.util.Scanner;

public class console {
	public static void main(String[] args) {
		System.out.print("bom ");
		System.out.print("dia\n");
		System.out.println("bom");
		System.out.println("dia");
		System.out.printf("megasena: %d %d %d%n", 1, 2, 3);
		System.out.printf("\nsalário: %.1f", 1234.5678);
		System.out.printf("nome: %s%n", "joao");
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite seu nome: ");
		String nome = entrada.nextLine();
		System.out.print("Digite seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		System.out.print("digite sua idade: ");
		int idade = entrada.nextInt();
		System.out.printf("%s %s tem %d anos ", nome, sobrenome, idade );
		entrada.close();
	}

}
