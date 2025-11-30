package ArrayListCollections.Collections;

import java.util.Objects;

public class Usuario {
    String nome;

    public Usuario(String nome){
        this.nome = nome;
    }

    //determina como sera impressa minha mensagem
    //implicitamente ele ira chamar esse método
    public String toString() {
        return "Meu nome é " + this.nome + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Usuario usuario)) return false;
        return Objects.equals(nome, usuario.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nome);
    }
}
