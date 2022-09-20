package oo.composicao;

public class Motor {
	boolean ligado = false;
	double fatorinjecao = 1;
	final Carro carro;
	
	
	Motor(Carro carro){
		this.carro = carro;
	}
	int giros() {
		if(!ligado) {
			return 0;
		}
		else {
		return (int)Math.round(fatorinjecao * 3000);
		}
	}

}
