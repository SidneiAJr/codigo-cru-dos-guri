import java.util.*;
import java.util.stream.*;

public class Streams {
    public static void main(String[] args) {

        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // filter - filtra
        List<Integer> pares = numeros.stream()
            .filter(n -> n % 2 == 0)
            .collect(Collectors.toList());
        System.out.println(pares); // [2, 4, 6, 8, 10]

        // map - transforma
        List<Integer> dobrados = numeros.stream()
            .map(n -> n * 2)
            .collect(Collectors.toList());
        System.out.println(dobrados); // [2, 4, 6, 8, 10, 12, 14, 16, 18, 20]

        // reduce - reduz a um valor
        int soma = numeros.stream()
            .reduce(0, Integer::sum);
        System.out.println(soma); // 55

        // filter + map + collect juntos
        List<String> resultado = numeros.stream()
            .filter(n -> n > 5)
            .map(n -> "num:" + n)
            .collect(Collectors.toList());
        System.out.println(resultado); // [num:6, num:7, num:8, num:9, num:10]

        // count
        long qtd = numeros.stream()
            .filter(n -> n % 2 == 0)
            .count();
        System.out.println(qtd); // 5

        // anyMatch / allMatch / noneMatch
        boolean temMaiorQueCinco = numeros.stream().anyMatch(n -> n > 5);
        boolean todosPares = numeros.stream().allMatch(n -> n % 2 == 0);
        System.out.println(temMaiorQueCinco); // true
        System.out.println(todosPares);        // false

        // sorted
        List<Integer> ordenado = numeros.stream()
            .sorted(Comparator.reverseOrder())
            .collect(Collectors.toList());
        System.out.println(ordenado); // [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]

        // findFirst
        Optional<Integer> primeiro = numeros.stream()
            .filter(n -> n > 7)
            .findFirst();
        primeiro.ifPresent(n -> System.out.println("Primeiro maior que 7: " + n)); // 8
    }
}