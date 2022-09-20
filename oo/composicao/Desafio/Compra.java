package oo.composicao.Desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	final List<Item> itens = new ArrayList<>();
	void adicionarItem(Produto p , int quantidade) {
		this.itens.add(new Item(p,quantidade));
	}
	
	void adicionarItem(String nome , double preco, int qtd) {
		var produto = new Produto(nome,preco);
		this.itens.add(new Item(produto,qtd));
	}
	
	
	double obterValorTotal(){
		 double total = 0;
		 for(Item item: itens) {
			 total += item.quantidade * item.produto.preco;
		 }
		 
		 return total;
		
		
	}
	}
