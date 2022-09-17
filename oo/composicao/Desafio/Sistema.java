package oo.composicao.Desafio;

public class Sistema {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Azul","Gol",2020);
         carro1.MontarCarro("Pirreli",35,4,"Azul",3500,"43523");
            carro1.MostrarCarro();
             
         Carro carro2 = new Carro("Vermelho","Voyage",1970);
             carro2.MontarCarro("Pirreli",35,4,"Vremelho",5000,"568326");
             carro2.MostrarCarro();
             
             
             Carro carro3 = new Carro("Preto","Fox",2015);
             carro3.MontarCarro("Pirreli",35,2,"Preto",3200,"2336515");
             carro3.MostrarCarro();
         }
}
