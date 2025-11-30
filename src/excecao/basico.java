package excecao;

public class basico {
    public static void main(String[] args) {

        Aluno a1 = null;

        try {
            imprimirAluno(a1);
        } catch (Exception e){
            System.out.println("Ocorreu um erro no momento imprimir do usuario");
        }

        try {
            System.out.println(4/0);
        } catch (ArithmeticException e){
            System.out.println("Ocorreu um erro: " + e.getMessage());
        }

        System.out.println("fim :)");

    }

    public static void imprimirAluno(Aluno aluno){
        System.out.println(aluno.nome);
    }
}
