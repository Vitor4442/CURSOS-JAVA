package ArrayListCollections.Collections;

import java.util.ArrayList;
import java.util.List;

public class Lista {
    public static void main(String[] args) {
        List<Usuario> lista = new ArrayList<>();

        Usuario u1 = new Usuario("ana");
        lista.add(u1);
        lista.add(new Usuario("Carlos"));
        lista.add(new Usuario("Ana"));
        lista.add(new Usuario("José"));

        System.out.println(lista.get(3)); //em list consigo acessaar apartir do indice

        lista.remove(1); //remove e retorna true caso exista e se eu printar
        lista.remove(new Usuario("José"));

        System.out.println("Tem ? " + lista.contains(new Usuario("Lia"))); //contains verifica se tem uusuario com esse nome no caso aqyu ura retorana false
        System.out.println("Tem ? " + lista.contains(u1));

        for(Usuario u: lista){
            System.out.println(u);
        }

    }
}
