package ArrayListCollections.Collections.FILA;

import java.util.LinkedList;
import java.util.Queue;

public class fILA {
    public static void main(String[] args) {
        Queue<String> filaPro = new LinkedList<>();

        filaPro.add("ana"); //adiciona e quando a fila estiver cheia retorna uma IllegalStateException
        filaPro.offer("ana"); //adicona retorna verdadeiro ou falso
        filaPro.offer("Carlos");
        filaPro.offer("Daniela");

        System.out.printf(filaPro.element()); //lança uma exceção
        System.out.printf(filaPro.peek()); // retorna null
        System.out.printf(filaPro.peek()); // le o elemento da fila mas não remove o elemento

        //limpa a fila filaPro.clear();
        //ve o tamanho da fil fila.size();
        //fila.isEmbty(); verifica se a fila esta vazia

        System.out.println(filaPro.poll()); //Ele vai retorna o primeiro elemento da fila ja removendo
        System.out.println(filaPro.poll());
        System.out.println(filaPro.poll());
        System.out.println(filaPro.poll());
        System.out.println(filaPro.poll());

    }

}
