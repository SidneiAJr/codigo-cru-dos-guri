import java.util.*;

public class Collections {
    public static void main(String[] args) {

        // LIST - ordenada, permite duplicatas
        List<String> lista = new ArrayList<>();
        lista.add("Java");
        lista.add("PHP");
        lista.add("Rust");
        lista.add("Java"); // duplicata ok!
        System.out.println(lista); // [Java, PHP, Rust, Java]

        // SET - nao permite duplicatas
        Set<String> set = new HashSet<>();
        set.add("Java");
        set.add("PHP");
        set.add("Java"); // ignorado!
        System.out.println(set); // [Java, PHP]

        // MAP - chave/valor
        Map<String, Integer> map = new HashMap<>();
        map.put("Java", 30);
        map.put("PHP", 20);
        map.put("Rust", 10);
        System.out.println(map.get("Java")); // 30

        // iterando map
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        // QUEUE - fila FIFO
        Queue<String> fila = new LinkedList<>();
        fila.offer("primeiro");
        fila.offer("segundo");
        fila.offer("terceiro");
        System.out.println(fila.poll()); // primeiro - remove da fila
    }
}