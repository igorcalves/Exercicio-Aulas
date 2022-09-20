package Streams.Desafio;
import java.util.function.Predicate;
import java.util.function.Function;
public class Filtros {
        static Predicate<Veiculo> Carro = cm -> cm.rodas == 4;
        static Predicate<Veiculo> Moto = cm -> cm.rodas == 2;
        static Predicate<Veiculo> Caro = CC  -> CC.preco >= 40000;
        static Predicate<Veiculo> Barato = CB  -> CB.preco <= 40000;
        static Predicate<Veiculo> motoCara = MC  -> MC.preco >= 10000;
        static Predicate<Veiculo> MOTOBarata = MB  -> MB.preco <= 10000;

        static Function<Veiculo, String> RetornomapCarro = rmap -> {
            if(rmap.preco >= 40000){
            return "\nCarro Selecionado:   " 
            + "Carro: " + rmap.nome +                                            
            " Marca: " + rmap.marca +
            " Preco: " + rmap.preco +
            " Cor: " + rmap.cor + "\nTa caro" + "\n";
            }
            else{
                return "\nCarro Selecionado:  " 
            + "Carro: " + rmap.nome +                                            
            " Marca: " + rmap.marca +
            " Preco: " + rmap.preco +
            " Cor: " + rmap.cor + "\nTa batato" + "\n";
            }
            };
        static Function<Veiculo, String> RetornomapMoto = rmap -> {
                if(rmap.preco >= 10000){
                return "\nMoto Selecionado:   " 
                + "Moto: " + rmap.nome +                                            
                " Marca: " + rmap.marca +
                " Preco: " + rmap.preco +
                " Cor: " + rmap.cor + "\nTa caro" + "\n";
                }
                else{
                    return "nMoto Selecionado:" 
                + "Moto: " + rmap.nome +                                            
                " Marca: " + rmap.marca +
                " Preco: " + rmap.preco +
                " Cor: " + rmap.cor + "\nTa batato" + "\n";
                }
                };


}
