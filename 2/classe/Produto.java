package classe;

public class Produto {

	String nome;
	double preco;
	static double desconto;
	
	Produto(){
		
	}
	Produto (String nomeInicial,double precoInicial){
		
		nome = nomeInicial;
		preco = precoInicial;
	}
	
	double precoComDesconto(){
		return preco * desconto;
		
	}
	double precoComDesconto(double DescontoDoGerente) {
		return preco * (1 - (desconto + DescontoDoGerente));
	}
}