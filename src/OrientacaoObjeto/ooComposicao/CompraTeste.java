package OrientacaoObjeto.ooComposicao;

public class CompraTeste {
    public static void main(String[] args) {

        Compra c1 = new Compra();
        c1.cliente = "João Pedro";

        c1.adcionarItem("Caneta", 20, 7.43);
        c1.adcionarItem("Borracha", 12, 3.89);
        c1.adcionarItem("Caderno", 3, 18.79);

        System.out.println(c1.itens.size());
        System.out.println(c1.getValorTotal());

        // Só pra mostra a relação bidireecional
        double total = c1.itens.get(0).compra.itens.get(1).compra.getValorTotal();
        System.out.println("O total é" + total);
    }

}
