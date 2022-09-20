package Streams.Desafio;

import java.util.Arrays;
import java.util.List;


public class DesafioFilter {
    public static void main(String[] args) {
        Veiculo v1 = new Veiculo("Gol", "Preto", "Volksvagem", 4,40000);
        Veiculo v2 = new Veiculo("Voyage", "Branco", "Volksvagem", 4,50000);
        Veiculo v3 = new Veiculo("Gol Quadrado", "Preto", "Volksvagem", 4,5000);
        Veiculo v4 = new Veiculo("Teneré", "Branca", "Yamaha", 2,13000);
        Veiculo v5 = new Veiculo("Factor", "Vermelha", "Yamaha", 2,9000);
        Veiculo v6 = new Veiculo("Titan 150", "Preta", "Honda", 2, 12000);

        List<Veiculo> veiculos = Arrays.asList(v1,v2,v3,v4,v5,v6);
                                          
    

        veiculos.stream()
        .filter(Filtros.Caro)
        .filter(Filtros.Carro)
        .map(Filtros.RetornomapCarro)
        .forEach(System.out::println); 
        veiculos.stream()
        .filter(Filtros.Carro)
        .filter(Filtros.Barato)
        .map(Filtros.RetornomapCarro)
        .forEach(System.out::println);
        veiculos.stream()
        .filter(Filtros.Moto)
        .filter(Filtros.motoCara)
        .map(Filtros.RetornomapMoto)
        .forEach(System.out::println);

        
    }
}
