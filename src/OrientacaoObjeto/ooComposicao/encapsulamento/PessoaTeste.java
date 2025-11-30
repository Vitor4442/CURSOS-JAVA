package OrientacaoObjeto.ooComposicao.encapsulamento;

public class PessoaTeste {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa(32,"Pedro");
        p1.setIdade(-23);

        System.out.println(p1.getIdade()); //ler
        System.out.println(p1); //tooString

    }
}
