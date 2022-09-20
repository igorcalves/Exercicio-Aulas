package Lambdas;

import java.util.Arrays;
import java.util.List;

class Foreach {
  public static void main(String[] args) {
    
    List<String> aprovados = Arrays.asList("Ana","Bia","Lia","Gui");
    
    System.out.println("Padrão\n\n\n\n");
    for(String nome: aprovados){
      System.out.println(nome);
    }
    
    //lambda #1
    System.out.println("lamba\n\n\n");
    aprovados.forEach(nome -> System.out.println(nome));
    
    //lambda #2
    System.out.println("lamba 2");
    aprovados.forEach(nome -> meuImprimir(nome));
    
    System.out.println("\nMethod Reference");
    aprovados.forEach(System.out::println);
    
    System.out.println("\nMethod 2 Reference");
    aprovados.forEach(Foreach::meuImprimir);
    
    
    }
    static void meuImprimir(String nome){
      System.out.println("oi meu nome é " + nome);
    }
}