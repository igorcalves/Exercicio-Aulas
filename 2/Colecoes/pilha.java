package Colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class pilha {
	
	public static void main(String[] args) {
		Deque<String> livros = new ArrayDeque<>();
		livros.add("O pequeno principe");
		livros.push("Don Quixote");
		livros.push("O Hobbit");
		
		for(String livro: livros) {
			System.out.println(livro);
		}
		
		System.out.print("\n\n\n\n");
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		System.out.println(livros.pop()); 
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.remove());
		
	
	}

}
