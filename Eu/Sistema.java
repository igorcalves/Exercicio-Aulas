package Eu;

public class Sistema {
	public static void main(String[] args) {
		
		Professor p1 = new Professor("Jose Alves");
		Professor p2 = new Professor("Igor alves");
		Professor p3 = new Professor("Ana Alves");
		Curso c1 = new Curso("Excel");
		Curso c2 = new Curso("World");
		Curso c3 = new Curso("Power Point");
		Aluno a1 = new Aluno("Ana", "Branca", 29, p2, c3);
		Aluno a2 = new Aluno("Igor", "Preto", 29, p3, c2);
		Aluno a3 = new Aluno("Davi", "Preto", 29, p1, c1);
		
		a1.mostrarNaTela();
		a2.mostrarNaTela();
		a3.mostrarNaTela();
	
	}
}
