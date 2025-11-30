package OrientacaoObjeto.ooComposicao;

import java.util.ArrayList;

public class Compra {

    String cliente;
    ArrayList<Item> itens = new ArrayList<>();

    void adcionarItem(String nome, int quantiadae, double preco){
        this.adcionarItem(new Item(nome, quantiadae, preco));
    }

    void adcionarItem(Item item){
        this.itens.add(item);
        item.compra = this;
    }

    double getValorTotal(){
        double total = 0;

        for (Item item: itens){
            total += item.quantidade * item.preco;
        }
        return total;
    }
}
