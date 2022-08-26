package MeusTestes;

import java.util.Scanner;

public class quadrado {
	public static void main(String[] args) {

	
		
		Scanner E = new Scanner(System.in);
		System.out.print("digite um valor para saber o quadrado dele: ");
		Double  n = E.nextDouble();
		Double total = n * n;
		System.out.printf("o quadrado de %.2f e : %.2f", n, total);
		
		
		
		
		E.close();
		System.out.println();
}
}
