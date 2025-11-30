package OrientacaoObjeto.polimorfismo;

public class Jantar {
    public static void main(String[] args) {

        Pessoa1 convidado = new Pessoa1(99.65);

        Arroz ingrediente1 = new Arroz(0.2);
        Feijao ingrediente2 = new Feijao(0.1);
        Comida ingrediente3 = new Arroz(0.3);

        convidado.comer(ingrediente1);
        convidado.comer(ingrediente2);
        convidado.comer(ingrediente3);

        System.out.println(convidado.getPeso());

        Sorvete sobremesa = new Sorvete(0.4);

        convidado.comer(sobremesa);
        System.out.println(convidado.getPeso());

    }
}
