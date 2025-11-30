package ArrayListCollections;
import java.util.Scanner;
import java.util.Arrays;

public class DesafioArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //entrada de dados
        System.out.println("Digite a Quantidade de Notas: ");
        int qtdNotas = sc.nextInt() ;
        System.out.println("Quantidade de notas: " +qtdNotas);


        double[] notasAlunoA = new double[qtdNotas];

        for(int i = 0; i<notasAlunoA.length; i++){
            System.out.println("Informe a nota " + (i + 1) + ":");
            notasAlunoA[i] = sc.nextDouble();
        }

        //saida da notas
        System.out.println(Arrays.toString(notasAlunoA));

        //processamento da média
        double somaNotas = 0;
        for(int i = 0; i<notasAlunoA.length; i++){
            somaNotas += notasAlunoA[i];
        }

        //saida da média
        System.out.println("A média do aluno é: " + somaNotas/qtdNotas);
    }
}
