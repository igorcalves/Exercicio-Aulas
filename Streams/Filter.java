package Streams;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;


public class Filter {
  public static void main(String[] args) {
    Aluno a1 = new Aluno("Ana", 7.8);
    Aluno a2 = new Aluno("Bia", 5.8);
    Aluno a3 = new Aluno("Daniel", 7.8);
    Aluno a4 = new Aluno("Gui", 7.8);
    Aluno a5 = new Aluno("Rebeca", 7.8);
    Aluno a6 = new Aluno("Pedro", 7.8);  
      
	List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4,a5,a6);   

    Predicate<Aluno> aprovado = a -> a.nota >=7;
    Function<Aluno,String> saudacaoAprovado = a -> "Parabens " + a.nome +" Voce foi aprovado";
    

    alunos.stream()
      .filter(aprovado)
      .map(saudacaoAprovado)
      .forEach(System.out::println);
  }
}
