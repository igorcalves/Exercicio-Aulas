package classe;


public class ProdutoTeste {

	public static void main(String[] args) {
		
		Produto.desconto = 0.35;
		Produto p1 = new Produto("notebook",4000.3);
		//p1.nome = "Notebook";
		//p1.preco = 4000.3;
		//p1.desconto = 0.25;
		
		var p2 = new Produto();
		p2.nome = "Caneta Preta";
		p2.preco = 100;

		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		double precofinal = p1.precoComDesconto();
		double precofina2 = p2.precoComDesconto(0);
		
		System.out.printf("preco final %.2f\n", precofinal);
		System.out.printf("preco final %.2f\n", precofina2);
	}
}
