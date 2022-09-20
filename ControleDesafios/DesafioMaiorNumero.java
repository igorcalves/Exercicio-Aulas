package ControleDesafios;

import java.util.Scanner;

public class DesafioMaiorNumero {

	  public static void main (String[]args)
	  {
	  int num = 0 ;
	  int num1 = 0; 
	    Scanner entrada = new Scanner (System.in);
	    for(int i =1; i <=10; i++){
	        System.out.printf("\nDigite o %dº valor: ", i);
	        num = entrada.nextInt();
	        
	        if (num >= num1){
	            num1 =num;
	            
	        }
	    }
	    System.out.printf("o maior numero digitado é %d",num1);
	    entrada.close ();
	  }

	
}
