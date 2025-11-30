package excecao.B.PersonalizadaA;

import excecao.Aluno;

public class Valida {
    private Valida (){}

    public static void aluno (Aluno aluno) throws StringVaziaException2, NumeroForaIntervaloException{
        if (aluno == null){
            throw new IllegalArgumentException("O aluno esta nulo");
        }
        if(aluno.nome == null || aluno.nome.trim().isEmpty()){
            throw  new StringVaziaException2("nome");
        }
        if(aluno.nota < 0 || aluno.nota > 10){
            throw new NumeroForaIntervaloException("Nota");
        }
    }
}
