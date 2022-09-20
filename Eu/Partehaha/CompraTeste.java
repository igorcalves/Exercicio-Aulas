package Eu.Partehaha;

public class CompraTeste {
	
	public static void main(String[] args) {
		 Item item0 = new Item("Caneta Azul",1,4.50);
		 Item item1 = new Item("Caneta Preta",1,4.50);
		 Item item2 = new Item("Caneta Vermelha",1,4.50);
		 Item item3 = new Item("Caneta Verde",1,4.50);
		 Item item4 = new Item("Caneta Roxa",1,4.50);
		 Item item5 = new Item("Caneta Rosa",1,8.50);
		 Compra c1 = new Compra();
		 
		 c1.adicionarItem(new Item("Caneta", 40, 4));
		 c1.nome = "igor";
		 c1.adicionarItem(item0);
		 c1.adicionarItem(item1);
		 c1.adicionarItem(item2);
		 c1.adicionarItem(item3);
		 c1.adicionarItem(item4);
		 c1.adicionarItem(item5);
		 
		 c1.MostrarnaTela();
		 System.out.println(c1.ObterQuantidade());
		 
		 
	}

}
