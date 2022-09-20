package ControleDesafios;

import java.util.Scanner;

public class DesafioLetraPorLetra {
	public static void main (String[]args)
	  {
	    Scanner entrada = new Scanner (System.in);
	    System.out.print("Digite um nome: ");
	    String s = entrada.nextLine();
	    char letras[] = s.toCharArray ();
	    for (int i = 0; i < letras.length; i++)
	      {
		System.out.print ("\n" + letras[i]);
	      }

	    entrada.close ();
	  }

}
