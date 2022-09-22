package excecao.PersonalizadaB;

import excecao.Aluno;

public class TesteValidacoes {
    public static void main(String[] args) {
        try{
            
            Aluno aluno =  new Aluno ("Ana   ", 7.0);
            Validar.Aluno(aluno);

            Validar.Aluno(null);
        }catch(StringVaziaException e){
            System.out.println(e.getMessage());
        }catch(NumeroForaDoIntervalo | IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
       
    }
    
}
