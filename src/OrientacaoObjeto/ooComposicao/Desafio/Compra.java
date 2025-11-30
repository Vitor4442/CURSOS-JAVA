package OrientacaoObjeto.ooComposicao.Desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
    final List<Item> itens = new ArrayList<>();

    void AdicionaItem(Produto produto, int quantidade){
        this.itens.add(new Item(produto, quantidade));
    }

    void AdicionaItem(String nome, double preco, int quantidade){
        var produto = new Produto(nome, preco);
        this.itens.add(new Item(produto, quantidade));
    }

    double total(){
        double total = 0;

        for(Item item: itens){
            total += item.quantidade * item.produto.preco;
        }
        return total;
    }
}
