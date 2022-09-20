package Streams.Desafio;

import java.util.function.Function;
import java.util.function.Predicate;

public class FSite {
    static Predicate<ProdutosSite> promocao = p -> p.desconto >0;
    static Predicate<ProdutosSite> frete = f -> f.frete == true;

    static Function<ProdutosSite, String> mapa = m -> 
        "Produto: " + m.nome + " Preco: " + m.preco + " Desconto: " +  m.desconto * 100 + " %" + " FRETE GRATIS !!!" + " SUPER PROMOÇÃO";
}
