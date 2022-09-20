package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("olá pessoal".charAt(1));
		
		String s = "Boa tarde";
		s = s.toUpperCase();
		System.out.println(s.concat("!!!"));
		System.out.println(s +"!!!");
		System.out.println(s.startsWith("BOA"));
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.endsWith("TARDE"));
		System.out.println(s.length());
		System.out.println(s.equals("BOA TARDE"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		var nome = "pedro";
		var sobrenome = "santos";
		var idade = 33 ; 
		var salario = 12345.987;
		
		System.out.println("nome: "+ nome + "\nsobrenome:" + sobrenome);
		System.out.printf("nome: %s %s tem %d\nganha %.2f\n\n\n", nome, sobrenome, idade, salario);
		
		String Frase =String.format("nome: %s %s tem %d\nganha %.2f", nome, sobrenome, idade, salario);
		System.out.println(Frase);
		
		
	}

}
