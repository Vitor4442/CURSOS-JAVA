package generics;

public class CaixaNumeroTeste {
    public static void main(String[] args) {
        CaixaNumero<Double> caixaA = new CaixaNumero<Double>();
        caixaA.aguardar(32.0);

        CaixaNumero<Integer> caixaB = new CaixaNumero<Integer>();
        caixaB.aguardar(3);
    }
}
