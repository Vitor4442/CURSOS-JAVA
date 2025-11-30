package ArrayListCollections;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        Map<Integer, String> usuarios = new HashMap<>();

        usuarios.put(1, "Roberto"); //adicionou
        usuarios.put(1, "Ricardo"); //Alterou
        usuarios.put(2, "Ricardo");
        usuarios.put(3, "Ricardo");

        System.out.println(usuarios.size());
        System.out.println(usuarios.isEmpty());

        System.out.println(usuarios.keySet());
        System.out.println(usuarios.values());
        System.out.println(usuarios.entrySet());

        System.out.println(usuarios.containsKey(20)); //false porque nao tem a chave 20 no map
        System.out.println(usuarios.containsValue("Ricardo")); //true porque tenho um valor ricardo

        System.out.println(usuarios.get(20));
        System.out.println(usuarios.remove(1));

        for(int chave: usuarios.keySet()){
            System.out.println(chave);
        }

        for(String valor: usuarios.values()){
            System.out.println(valor);
        }

        for (Map.Entry registro: usuarios.entrySet()){
            System.out.println(registro.getKey());
            System.out.println(registro.getValue());
        }


    }

}
