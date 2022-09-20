package Eu;

public class Aluno {

	String nome;
	String cor;
	int idade;
	Curso curso;
	Professor professor;
	Aluno (String nome, String cor,int idade, Professor professor,Curso curso){
		this.nome = nome;
		this.cor = cor;
		this.idade = idade;
		this.professor = professor;
		this.curso = curso;
		
			
		}
	void mostrarNaTela() {
		System.out.println("\nAluno: " + this.nome + "\nCor: " + this.cor + "\nIdade: " + this.idade +
	                     "\nProfessor:" + professor.nomeProfessor + "\nCurso: " + curso.nomeCurso);
	}
}
