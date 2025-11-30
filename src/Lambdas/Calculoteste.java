package Lambdas;

public class Calculoteste {
    public static void main(String[] args) {

        Calculo calculo = new soma();
        System.out.println(calculo.executar(2, 3));

        calculo = new Multiplciar();
        System.out.println(calculo.executar(2, 3));



    }
}
