package oo.heranca.Desafio;

public class Carro {
	int VelocidadeAtual;
	final int VELOCIDADE_MAXIMA;
	int delta = 5;
	
	Carro(int velocidadeMaxima){
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	void  acelerar() {
		
		if(VelocidadeAtual + delta > VELOCIDADE_MAXIMA) {
		 VelocidadeAtual = VELOCIDADE_MAXIMA;
		}else {
		VelocidadeAtual +=delta;
	 }
	
	}
	
	void Freiar() {
		if(VelocidadeAtual >= 5 ) {
			VelocidadeAtual -=5;
			
		}else {
			VelocidadeAtual = 0;
			
		}
		
	}
}
