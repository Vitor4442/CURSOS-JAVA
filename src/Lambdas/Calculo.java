package Lambdas;

@FunctionalInterface
public interface Calculo {

    double executar (double a, double b);

    default String legal(){
        return "legal";
    }

    static String massa(){
        return "muito legal";
    }
    //double teste(); em @functionalintercafe so pode ter um metodo
}
