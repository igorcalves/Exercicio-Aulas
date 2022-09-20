package Eu.Partehaha;

public class Sistema {
	public static void main(String[] args) {
		PlacadeVideo pdv = new PlacadeVideo("Rtx 2060", "Geforce");
		PlacaMae pm = new PlacaMae("H310M", "Gigabyte");
		Processador po = new Processador("Core i5 9400f", "Intel", 3.90);
		
		
		ContrucaodePecas ctp = new ContrucaodePecas("Computador do igor",pdv, pm, po);
		
		ctp.MostrarnaTela();
	}
}
