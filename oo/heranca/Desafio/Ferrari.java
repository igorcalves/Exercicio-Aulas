package oo.heranca.Desafio;

public class Ferrari extends Carro {
	
	Ferrari(int velocidade){
		super(velocidade);
		super.delta = 5;
	}
	
//	void  acelerar() {
//		VelocidadeAtual +=15;
//	}

	void Freiar() {
		if (VelocidadeAtual >=15) {
			VelocidadeAtual -= 15;
		}
		else {
			VelocidadeAtual =  0;
		}
	}
}
	


