package excecao.PersonalizadaA;

import excecao.Aluno;

import java.lang.foreign.ValueLayout;

public class TesteValidacoes {
    public static void main(String[] args) {
        try {
            Aluno a1 = new Aluno("ewe", 1);
            Valida.aluno(a1);
            Valida.aluno(null);
        } catch (StringVaziaException2 e) {
            System.out.println(e.getMessage());
        } catch (NumeroForaIntervaloException
                    | IllegalArgumentException e ){
            System.out.println(e.getMessage());
        }
        System.out.println("Fim");
    }
}
