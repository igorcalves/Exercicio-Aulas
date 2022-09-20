package oo.heranca.encapsulamento.Desafio;

public class Jantar {
	public static void main(String[] args) {
		
	
	Pessoa convidado = new Pessoa(98.0);
	Arroz comida1 = new Arroz(0.25);
	Feijao comida2 = new Feijao(0.35);
	//Arroz comida1 = new Arroz(0.25);
	
	
	convidado.Comer(comida1);
	convidado.Comer(comida1);
	convidado.Comer(comida1);
	convidado.Comer(comida1);
	convidado.Comer(comida1);
	convidado.Comer(comida2);
	System.out.println(convidado.getPeso());
	

	}
	
}
