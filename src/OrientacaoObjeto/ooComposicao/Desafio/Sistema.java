package OrientacaoObjeto.ooComposicao.Desafio;

public class Sistema {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Maria Julia");
        Compra compra1 = new Compra();
        compra1.AdicionaItem("Caneta", 7.45, 32);
        compra1.AdicionaItem(new Produto("Impresora", 343.43), 1);

        Compra compra2 = new Compra();
        compra2.AdicionaItem("Caderno", 12.45, 32);
        compra2.AdicionaItem(new Produto("Notebook", 2343.43), 1);

        cliente.compras.add(compra1);
        cliente.compras.add(compra2);

        System.out.println(cliente.Total());

    }
}
