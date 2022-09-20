package Eu.Partehaha;

public class ContrucaodePecas {
	String nome;
	PlacadeVideo placaDeVideo;
	PlacaMae placaMae;
	Processador processador;
	
	
	ContrucaodePecas(String nome,PlacadeVideo p,PlacaMae pm,Processador po){
		this.nome = nome;
		this.placaDeVideo = p;
		this.placaMae = pm;
		this.processador = po;
	}
	
	void MostrarnaTela() {
		System.out.printf("Nome do Computador: %s\n"
				          +"Placa de Video: %s \nModelo: %s\n"
						  +"Placa Mae: %s \nModelo: %s\n"
						  + "Processador: %s \nModelo: %s \nVelocidade %s\n"
						  ,this.nome
						  ,placaDeVideo.nome,placaDeVideo.marca
						  ,placaMae.nome,placaMae.marca
						  ,processador.nome,processador.modelo,processador.vel);
	}
	
	

}
