package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;
class Map {
  public static void main(String[] args) {
    
    Consumer<String> print = System.out::print;
    
    List<String> marcas = Arrays.asList("BMW ", "Audi ", "Honda ");
    
    marcas.stream().map(m -> m.toUpperCase()).forEach(print);
    UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
   
  
    //System.out.println(maiscula.andThen(primeiraletra).andThen(grito).apply("BMW"));
 

    
    
    System.out.println("\nU sando composição");
  	marcas.stream()
      	.map(Utilitarios.maiscula)
      	.map(primeiraLetra)
      	
      	
      	.map(Utilitarios::grito)
      	.forEach(print);
  
  
  

  
  }
}