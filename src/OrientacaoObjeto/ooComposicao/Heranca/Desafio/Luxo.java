package OrientacaoObjeto.ooComposicao.Heranca.Desafio;

public interface Luxo {
    void ligaAr();
    void desligarAr();

    default int velocidadeDoAr(){
        return 1;
    }
}
