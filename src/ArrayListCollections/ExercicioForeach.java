package ArrayListCollections;

public class ExercicioForeach {
    public static void main(String[] args) {
        double[] notasAlunoA = new double[4];
        notasAlunoA[0] = 10;
        notasAlunoA[1] = 10;
        notasAlunoA[2] = 10;
        notasAlunoA[3] = 10;

        double somaNotas = 0;

        for(double notas: notasAlunoA) {
            somaNotas += notas;
        }

        System.out.println(somaNotas/4);
    }

}
