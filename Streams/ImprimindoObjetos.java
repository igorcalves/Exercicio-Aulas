package Streams;
import java.util.stream.Stream;
import java.util.Arrays;
import java.util.List;
import java.util.Iterator;
class ImprimindoObjetos {
  public static void main(String[] args) {
    
    List<String> aprovados= Arrays.asList("Lu","Gui", "Luca","Ana");
    
    System.out.println("Usando for normal...");
    for(int i = 0;i < aprovados.size(); i++){
      System.out.println(aprovados.get(i));
    }
    
    System.out.println("\n\n\nUsando o foreach...");
    for(String nome : aprovados){
      System.out.println(nome);
    }
    System.out.println("\n\n\nUsando Iterator...");
    Iterator<String> it = aprovados.iterator();
    while(it.hasNext()){
      System.out.println(it.next());
      
    }
    
    System.out.println("\n\n\nUsando Stream....");
    Stream <String> st = aprovados.stream();
    st.forEach(System.out::println);// Laço interno!!!
    
    

    
    
    
  }
  
  
  
  
  
  
  
  
  
  
  
}
