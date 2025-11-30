package StreamsAPI;

import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionsProduto {

    public static Predicate<Produto> estoqueBaixo = p -> p.getQuantidade() <= 10;
    public static Predicate<Produto> anuncioBom = p -> p.isQualidadeAnuncio();
    public static Function<Produto, String> itensComEstoqueBaixo = p -> p.getProduto() + " Esta com estoque baixo";
    public static Function<Produto, String> itensComAnuncioRuim = p -> p.getProduto() + " Esta com a reputação Boa";



}
