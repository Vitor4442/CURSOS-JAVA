package ArrayListCollections.Collections;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBagunçado {
    public static void main(String[] args) {
        HashSet conjunto = new HashSet();

        conjunto.add(11.2); //double -> Double
        conjunto.add(false);
        conjunto.add(1);
        conjunto.add("José");

        System.out.println("Tamanho é: " + conjunto.size());

        conjunto.add(7);

        System.out.println("Tamanho é: " + conjunto.size());

        System.out.println(conjunto.remove("teste")); //false
        System.out.println(conjunto.remove("José")); //True

        System.out.println("Tamanho é: " + conjunto.size());//4

        //contains serve para ver se tem elemento no meu determinado conjunto
        System.out.println(conjunto.contains("José")); //False
        System.out.println(conjunto.contains(false)); //true

        //se eu colocar um add no mesmo valor ele ira ficar com 4 porque ele não aceita valor repetido

        Set nums = new HashSet();

        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);

        System.out.println(nums);
        System.out.println(conjunto);

        //mescla conjunto com nums
        conjunto.addAll(nums);

        System.out.println(conjunto);


    }
}
