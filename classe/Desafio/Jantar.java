package classe.Desafio;

public class Jantar {
	public static void main(String[] args) {
		Pessoa p = new Pessoa ("Igor Alves", 110);
		Comida C = new Comida ("Frango Assado", 1.0);
		
		System.out.printf("nome: %s \npeso %.2f\ncomeu: %s\ncom o peso de: %.2f gramas\n", 
				p.nome, p.peso, C.nome,C.peso);
		
			System.out.print("A PESSOA SE ALIMENTOU\n");
			System.out.printf("nome: %s \npeso %.2f\ncomeu: %s\ncom o peso de: %.2f gramas\n", 
					p.nome, p.peso, C.nome,C.peso);
			p.Comer(C);
			System.out.print("passou a pesar: " + p.peso);
			p.Comer(C);			
			System.out.print("\npassou a pesar: " + p.peso);
			p.Comer(C);			
			System.out.print("\npassou a pesar: " + p.peso);
			p.Comer(C);						
			System.out.print("\npassou a pesar: " + p.peso);
			
		
		
	
	
		
		
		
	}
}
