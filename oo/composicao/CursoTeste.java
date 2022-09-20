package oo.composicao;

public class CursoTeste {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Joao");
		Aluno a2 = new Aluno("Maria");
		Aluno a3 = new Aluno("Pedro");


		Curso c1 = new Curso("Java Completo");
		Curso c2 = new Curso("Web Completo");
		Curso c3 = new Curso("React Native");

		c1.adicionarAluno(a1);
		c1.adicionarAluno(a2);

		c2.adicionarAluno(a1);
		c2.adicionarAluno(a3);

		a1.adcionarCurso(c3);
		a2.adcionarCurso(c3);
		a3.adcionarCurso(c3);

		for (Aluno aluno : c3.alunos) {
			System.out.println("Estou matriculado no curso ..." + c3.nome);
			System.out.println("e meu nome e " + aluno.nome);
		}

		System.out.println(a1.cursos.get(1).alunos);

		Curso cursoE = a1.obterCursoPorNome("Java Completo");

		if (cursoE != null) {
			System.out.println(cursoE.nome);
			System.out.println(cursoE.alunos);

		}

	}
}
