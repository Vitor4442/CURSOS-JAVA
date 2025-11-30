package ArrayListCollections.Collections;

import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {
    public static void main(String[] args) {

        //dentro do <> se eu espicificar qual sera meu tipo obrigatoriamene mente minha lista vai ser desse tipo

        //Set<String> ListaAprovados = new HashSet<>(); //esse eo padrão porem esse nao organiza
        //sortedset conjuntos ordernados possui criterios de ordenação

        Set<String> ListaAprovados = new TreeSet<>(); //esse eo que organiza na hora de imprimir
        ListaAprovados.add("José");
        ListaAprovados.add("Gabriel");
        ListaAprovados.add("Carlos");
        ListaAprovados.add("Pedro");
        ListaAprovados.add("Ana");


        //nao possui ordenação
        for(String lista: ListaAprovados){
            System.out.println(lista);
        }

    }
}
