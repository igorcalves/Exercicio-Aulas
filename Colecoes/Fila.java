package Colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		// Offer e add -> adcionam  eleemeentos na fila
		// diferença é o comportamento quando a fila ta cheia!
		fila.add("Ana"); // retorna false
		fila.offer("Bia"); // lança uma exceção
		fila.offer("Carlos");
		fila.offer("Daniel");
		fila.offer("Rafaela");
		fila.offer("Gui");
		
		// peek e Element -> obtem o proximo da fila elemento sem remover
		// a diferença ocorre quando a fica esta fazia
		System.out.println(fila.peek()); // retorta null
		System.out.println(fila.peek());
		System.out.println(fila.element()); // lança uma excção
		System.out.println(fila.element());
	
		//fila.size(); ver o tamanho da fila
		//fila.clear();
		//fila.isEmpty()
		//fila.contains();		
		// poll  e remove: obtem o proximo elemento da fila e remove
		// ocorre quando a fila esta vazia
		
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove()); // lança uma exceção
		
	}
}
