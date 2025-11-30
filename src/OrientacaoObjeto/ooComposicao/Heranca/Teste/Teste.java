package OrientacaoObjeto.ooComposicao.Heranca.Teste;

import OrientacaoObjeto.ooComposicao.Heranca.Desafio.Civic;
import OrientacaoObjeto.ooComposicao.Heranca.Desafio.Ferrari;

public class Teste  {
    public static void main(String[] args) {
        Ferrari ferrari = new Ferrari(400);
        Civic civic = new Civic();

        ferrari.acelerar();

        System.out.println("Velocidade da Ferrari " + ferrari);

        civic.acelerar();

        System.out.println("Velocidade do civic " + civic);


    }
}
