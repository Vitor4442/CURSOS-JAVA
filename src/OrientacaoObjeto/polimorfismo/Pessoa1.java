package OrientacaoObjeto.polimorfismo;

public class Pessoa1 {
    private double peso;

    public Pessoa1(double peso){
        setPeso(peso);
    }

    public void comer(Comida comida){
        this.peso += comida.getPeso();
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso >= 0) {
            this.peso = peso;
        }
    }
}
