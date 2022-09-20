package Streams;

import java.util.function.Function;
import java.util.function.UnaryOperator;
public class Ult {
  
  final static Function<Integer, String> binario = b -> Integer.toBinaryString(b);
  final static UnaryOperator<String> inverter = i ->  new StringBuilder(i).reverse().toString();
  final static Function<String, Integer> decimalConver = d -> Integer.parseInt(d, 2);
   
  
}

  