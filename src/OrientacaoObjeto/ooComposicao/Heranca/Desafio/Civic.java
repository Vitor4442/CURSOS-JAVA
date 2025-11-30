package OrientacaoObjeto.ooComposicao.Heranca.Desafio;

public class Civic extends Carro{


    public Civic(){
        this(212);
    }

   public Civic(int velocidademaxima){
        super(velocidademaxima);
   }

    @Override
    public void acelerar() {
        velocidadeAtual += 10;
    }
}
