package classe.Desafio;

public class Pessoa {
	String nome;
	double peso;
	Pessoa (int peso){
		
		
	}
	
	Pessoa(String nome, double peso){
		this.nome = nome;
		this.peso = peso;
	}
	
	
	void Comer(Comida comida) {
		
		this.peso += comida.peso;
	}

}
