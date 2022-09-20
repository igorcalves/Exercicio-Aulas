package Eu.Partehaha;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	
	String nome;
	
	List<Item> itens = new ArrayList<>();
	
	void adicionarItem(Item item) {
		itens.add(item);
		
	}
	void MostrarnaTela() {
		for(Item item: itens) {
			System.out.println("Nome:" + item.nome + "\n"
					+ "Quantidade: " + item.quantidade + "\n"
					+ "Preco: " + item.preco + "\n"
					+ "");
		}
		
	}
	
	double ObterQuantidade() {
		double total = 0;
		for (Item item : itens) {
			total += item.preco * item.quantidade;
		}
		return total;
	}

}
