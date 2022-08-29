package oo.heranca.teste;

import oo.heranca.Desafio.Civic;
import oo.heranca.Desafio.Ferrari;

public class sistema {
	public static void main(String[] args) {
		
		Civic civic = new Civic();
		Ferrari ferrari = new Ferrari();
		
		
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		civic.Freiar();
		civic.Freiar();
		civic.Freiar();
		civic.Freiar();
		civic.Freiar();
		civic.Freiar();
		civic.acelerar();
		
		
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
