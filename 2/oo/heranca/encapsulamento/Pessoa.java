package oo.heranca.encapsulamento;

public class Pessoa {
	private int idade;
	  private String nome;
	  private String sobrenome;
	  public Pessoa(String nome,String sobrenome, int idade){
	    setIdade(idade);
	    setNome(nome);
	    setSobrenome(sobrenome);
	  }
	  
	  public String getNome(){
	    return this.nome;
	  }
	  
	  public void setNome(String nome){
	    this.nome = nome;
	    
	  }
	  
	  public String getSobrenome(){
	    return sobrenome;
	  }
	  
	  public void setSobrenome(String sobrenome){
	    this.sobrenome = sobrenome;
	  }
	  
	  public String getNomeCompleto(){
	    return getNome() + " " + getSobrenome();
	  }
	  
	  // Getter
	  public int  getIdade(){
	    return idade;
	  }
	  //Setter
	  public void setIdade(int novaIdade){
	    novaIdade = Math.abs(novaIdade);
	    if (novaIdade>= 0 && novaIdade <=120){
	    this.idade = novaIdade;  
	    }
	    
	  }
	  
	  public String toString(){
	    return "ola eu sou o " + getNome() + " e tenho " + getIdade() + " anos ";
	  }  
}
