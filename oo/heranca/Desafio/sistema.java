package oo.heranca.Desafio;

public class sistema {
	public static void main(String[] args) {
		
		Civic civic = new Civic(120);
		Ferrari ferrari = new Ferrari(230);
		
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		civic.Freiar();
		civic.Freiar();
		civic.Freiar();
		civic.Freiar();
		civic.Freiar();
		civic.Freiar();
		
		
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.Freiar();
		

		
		System.out.print("\n\nVelocidade atual do carro Civic : " + civic.VelocidadeAtual);
		System.out.print("\n\nVelocidade atual do carro Ferrari : " + ferrari.VelocidadeAtual);
	}

}
