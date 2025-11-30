package OrientacaoObjeto.ooComposicao;

public class Carro {
    Motor motor;

    Carro(){
        this.motor = new Motor(this);
    }

    public void acelerar(){
        if(motor.fatorInjecao < 2.5) {
            motor.fatorInjecao += 0.4;
        }
    }
    public void frear() {
        if (motor.fatorInjecao > 0.5) {
            motor.fatorInjecao -= 0.4;
        }
    }
    void ligar(){
        motor.ligado = true;
    }

    void desligado(){
        motor.ligado = false;
    }

    boolean estaLigado(){
        return motor.ligado;
    }
}
