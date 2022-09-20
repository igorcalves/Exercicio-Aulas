package Lambdas.Desafio;

import java.util.function.UnaryOperator;

import Lambdas.Produto;

import java.util.function.Function;
class Desafio {
  public static void main(String[] args) {
    
    Produto p = new Produto ("iPad",3235.89,0.13);
    
    UnaryOperator<Double> comDesconto = valor -> valor * (1 - p.desconto);
    UnaryOperator<Double> impostoMunicipal = valor -> valor >= 2500 ? valor * 1.085: valor ;
    UnaryOperator<Double> frete = valor -> valor >= 3000 ? valor + 100: valor + 50;
    UnaryOperator<Double> arredondar = valor -> Double.parseDouble(String.format("%.2f",valor)); 
    Function<Double, String> tudo = valor -> ("R$:" + valor).replace(",", ".") ;
    
    System.out.println(comDesconto.andThen(impostoMunicipal).andThen(frete).andThen(arredondar).andThen(tudo).apply(p.preco));
    
      
   
     
  }
}