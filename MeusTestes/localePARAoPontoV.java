package MeusTestes;

import java.util.Locale;
import java.util.Scanner;

public class localePARAoPontoV {
	public static void main(String[] args) {
		Scanner E =  new Scanner(System.in);
		E.useLocale(Locale.ENGLISH);
		System.out.print("digite um valor :");
		Double i = E.nextDouble();
		System.out.printf("O valor que voce digiout foi %.2f", i);
		E.close();
		
		}

}
