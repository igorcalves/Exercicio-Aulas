package oo.heranca.encapsulamento;

public class PessoaTeste {
	public static void main(String[] args) {
		
	
	Pessoa p1 = new Pessoa("igor","alves", -15);
    p1.setIdade(130);
    System.out.println(p1);
    System.out.println(p1.getNome());
    System.out.println(p1.getNomeCompleto());

}
}