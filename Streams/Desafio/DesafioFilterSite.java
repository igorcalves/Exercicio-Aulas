package Streams.Desafio;

import java.util.Arrays;
import java.util.List;

public class DesafioFilterSite {
    public static void main(String[] args) {
        ProdutosSite p1 = new ProdutosSite("Notebook", 3500.00, 0.15, true);
        ProdutosSite p2 = new ProdutosSite("Impressora", 2000.00, 0.25, true);
        ProdutosSite p3 = new ProdutosSite("Mouse", 200.00, 0.0, false);
        ProdutosSite p4 = new ProdutosSite("Teclado", 250.00, 0.00, false);
        ProdutosSite p5 = new ProdutosSite("Monitor", 1500.00, 0.08, true);
        
        
        
        List<ProdutosSite> produtos = Arrays.asList(p1,p2,p3,p4,p5);

        produtos.stream()
        .filter(FSite.promocao)
        .filter(FSite.frete)
        .map(FSite.mapa)
        .forEach(System.out::println);
    }
}
