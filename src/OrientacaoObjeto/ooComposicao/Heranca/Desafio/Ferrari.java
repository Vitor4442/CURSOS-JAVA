package OrientacaoObjeto.ooComposicao.Heranca.Desafio;

public class Ferrari extends Carro implements Esportivo, Luxo{
    private  boolean ligarTurbo;
    private boolean ligarAr;

    public Ferrari(){
        this(321);
    }

    public Ferrari(int velocidadeMaxima){
        super(velocidadeMaxima);
        setDelta(15);
    }

    @Override
    public void ligarTurbo() {
        ligarTurbo = true;
    }

    @Override
    public void desligarTurbo() {
        ligarTurbo = false;
    }

    @Override
    public void ligaAr() {
        ligarAr = true;
    }

    @Override
    public void desligarAr() {
        ligarAr = false;
    }

    @Override
    public int getDelta() {
        if(ligarTurbo && !ligarAr){
            return 35;
        } else if (ligarAr && ligarTurbo) {
            return 30;
        } else if (!ligarTurbo && !ligarAr) {
            return 20;
        } else{
            return 15;
        }

    }
}
