package excecao.PersonalizadaA;

public class StringVaziaException extends RuntimeException{
    private String nomeDoAtribuString;
    public StringVaziaException(String nomeDoAtributo) {
            this.nomeDoAtribuString = nomeDoAtributo;

    }
    

    public String getMessage() {
        return String.format("O atributo '%s' esta vazio", nomeDoAtribuString);
    }
    
}
