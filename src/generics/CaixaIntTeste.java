package generics;

public class CaixaIntTeste {
    public static void main(String[] args) {
        Caixa caixaA = new CaixaInt();
        caixaA.aguardar(1);

        System.out.println(caixaA.abrir());
    }
}
