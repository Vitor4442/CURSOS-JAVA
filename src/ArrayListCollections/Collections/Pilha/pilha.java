package ArrayListCollections.Collections.Pilha;

import java.util.ArrayDeque;
import java.util.Deque;

public class pilha {
    public static void main(String[] args) {
        Deque<String> livros = new ArrayDeque<>();

        livros.add("O pequeno principe");
        livros.push("Don quixote");
        livros.push("O hobbit");

        System.out.println(livros.peek());
        System.out.println(livros.element());

        //System.out.println(livros.poll());
       // System.out.println(livros.poll());
        //System.out.println(livros.poll());
        //System.out.println(livros.poll());

        //livros.size();
        //livros.clear();
        //livros.contains();
        //livros.isEmpty();

        for(String elemetos: livros){
            System.out.println(livros);
        }
    }
}
