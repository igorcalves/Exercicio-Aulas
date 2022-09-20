package oo.composicao.Desafio;

public class Carro {

    String nomeDoCarro;
String corDoCarro;
int anoDoCarro;
  	Chassi chassi;
  Carro (String corDoCarro,String nomeDoCarro,int anoDoCarro){
    this.nomeDoCarro = nomeDoCarro;
    this.corDoCarro = corDoCarro;
    this.anoDoCarro = anoDoCarro;
   
  }
  void MontarCarro(String marcaRoda,double calibragem,
                  int quantidadeDasPortas,String corDasPortas,
                  int giros,String numeracao){
    
    	Portas p = new Portas(quantidadeDasPortas,corDasPortas);
    	Rodas r = new Rodas(marcaRoda,calibragem );
    	Motor m = new Motor(giros,numeracao);
    	chassi = new Chassi(m,r,p);
    	
    
  }
  
  void MostrarCarro(){
    System.out.println("!!!!!Bem vindo o carro que foi montado foi !!!!!!!");
      
      System.out.println("Carro: " + this.nomeDoCarro);
      System.out.println("Cor do carro: " + this.corDoCarro);
      System.out.println("Ano do Carro: " + anoDoCarro);
      System.out.println("!!!Ficha Tecnica!!!");
      System.out.println("Quantidade de portas: " + chassi.portas.quantidadeDePortas + "\n"+"Cor das portas: " + chassi.portas.corDasPortas);
      System.out.println("Marca das Rodas: " + chassi.rodas.marcaRoda + "\n" +"Calibragem: " + chassi.rodas.calibragem);
      System.out.println("Numeracão do Motor: " + chassi.motor.numeracao + "\n" + "Giros: " + chassi.motor.giros + "\n\n\n\n");
    
  }
    
}
