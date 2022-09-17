package Lambdas;

import java.util.function.Function;

class Funcao {
    public static void main(String[] args) {
      
     Function<Integer, String> parOuImpar = numero -> numero %2 ==0? "Par" : "Impar";
      System.out.println(parOuImpar.apply(32));
      
      Function<String, String> oResultadoE = valor -> "o resultado é : " + valor;
      parOuImpar.apply(32);
      Function<String, String> empolgado = valor -> valor + "!!!";
      Function<String, String> oAdicional = valor -> valor + "eu consigo";
      Function<String, String> mais = valor -> valor + "!!!";
      
      String resultadoFinal = parOuImpar.
        andThen(oResultadoE)
        .andThen(empolgado)
        .andThen(oAdicional)
        .andThen(mais)
        .andThen(empolgado)
        .andThen(empolgado)
        .apply(32);
      
      System.out.println(resultadoFinal);
    }
  }
