import java.util.List;

class Main {
    public static void main(String[] args) {
        List<String> nomes = List.of("teste1","teste2","teste3");
        nomes.forEach(nome-> System.out.println(nome));
        nomes.stream()
        .map(nome->nome.toUpperCase())
        .filter(nome -> nome.startsWith("t"))
        .forEach(nome->System.out.println(nome));
    }
}