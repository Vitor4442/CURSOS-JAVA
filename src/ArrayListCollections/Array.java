package ArrayListCollections;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

        double[] notasAlunoA = new double[4];
        notasAlunoA[0] = 10;
        notasAlunoA[1] = 7.7;
        notasAlunoA[2] = 8;
        notasAlunoA[3] = 6.5;

        System.out.println(Arrays.toString(notasAlunoA));
        System.out.println("Primeira nota do alunoA: " + notasAlunoA[0]);

        double totalAlunoA = 0;
        for (int i = 0; i < notasAlunoA.length; i++) {
            totalAlunoA += notasAlunoA[i];
        }

        System.out.println(totalAlunoA / notasAlunoA.length);

        final double notaArmazenada = 7;
        double[] notasAlunoB = {notaArmazenada, 7.2, 5.4, 10};

        double totalALunoB = 0;
        for (int i = 0; i<notasAlunoB.length; i++){
            totalALunoB += notasAlunoB[i];
        }

        System.out.println(totalALunoB / notasAlunoB.length);
    }
}
