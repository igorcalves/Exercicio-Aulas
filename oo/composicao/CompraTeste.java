package oo.composicao;

public class CompraTeste {
	public static void main(String[] args) {
		
		Compra compra1 = new Compra();
		compra1.Cliente = "Joao Pedro";
		compra1.adcionarItem("Caneta", 20, 7.45);
		compra1.adcionarItem(new Item("Borracha", 12, 3.89));
		compra1.adcionarItem(new Item("Caderno", 3, 18.79));
		System.out.println(compra1.itens.size());
		System.out.println(compra1.getValorTotal());
		// só para mostrara a relação bidirecional
		double total = compra1.itens.get(1).compra.itens.get(1).compra.getValorTotal();
		
		System.out.println(total);
	 
	}
}
