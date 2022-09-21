package Streams;

import java.util.Objects;

class Aluno {
        final String nome;
        final Double nota;
        final Boolean bomComportamento;



        public Aluno(String nome, Double nota) {
          this(nome, nota, true);
        }


        public Aluno(String nome, Double nota, Boolean bomComportamento) {
          this.nome = nome;
          this.nota = nota;
          this.bomComportamento = bomComportamento;
        }


		@Override
		public String toString() {
			return "Aluno [nome=" + nome + ", nota=" + nota + "]";
		}


		@Override
		public int hashCode() {
			return Objects.hash(bomComportamento, nome, nota);
		}


		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Aluno other = (Aluno) obj;
			return Objects.equals(bomComportamento, other.bomComportamento) && Objects.equals(nome, other.nome)
					&& Objects.equals(nota, other.nota);
		}
        
        
        
      }
      

