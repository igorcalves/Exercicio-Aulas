package Arrays.Desafios;

import java.util.Scanner;
public class DesafioArray {
	
		public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
	      System.out.print("digite o tamanho do array: ");
	      int tamanhoDoArray = entrada.nextInt();
	      double notas[] = new double[tamanhoDoArray];
	      
	      for(int i = 0; i < tamanhoDoArray; i++){
	          System.out.printf("\ndigite a %dº nota: ",i+1);
	          notas[i] = entrada.nextInt();
	         
	          
	          
	      }
	      double guardarnota = 0;
	      for (double nota : notas){
	          guardarnota += nota;
	          
	      }
	        System.out.print(guardarnota/notas.length);
	        entrada.close();
		}
	}		

	
	