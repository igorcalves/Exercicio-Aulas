package oo.heranca.Desafio;

public class Carro {
	public int VelocidadeAtual;
	public final int VELOCIDADE_MAXIMA;
	protected int delta = 5;
	
	Carro(int velocidadeMaxima){
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	public void  acelerar() {
		
		if(VelocidadeAtual + delta > VELOCIDADE_MAXIMA) {
		 VelocidadeAtual = VELOCIDADE_MAXIMA;
		}else {
		VelocidadeAtual +=delta;
	 }
	
	}
	
	public void Freiar() {
		if(VelocidadeAtual >= 5 ) {
			VelocidadeAtual -=5;
			
		}else {
			VelocidadeAtual = 0;
			
		}
		
	}
}
