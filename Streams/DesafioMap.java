package Streams;
import java.util.function.Consumer;
import java.util.Arrays;
import java.util.List;
class DesafioMap {
  public static void main(String[] args) {
   Consumer<Object > print = System.out::println;
   List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
   
    
    
    
   nums.stream()
     .map(Ult.binario)
     .map(Ult.inverter)
     .map(Ult.decimalConver)
     .forEach(print);
    
   
    
  }
}