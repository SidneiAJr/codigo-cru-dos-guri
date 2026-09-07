public class StringModerno {

    public static void main(String[] args) {

        // isBlank - vazio ou so espacos
        System.out.println("".isBlank());    // true
        System.out.println("  ".isBlank());  // true
        System.out.println("oi".isBlank());  // false

        // strip - igual trim mas suporta unicode
        System.out.println("  oi  ".strip()); // "oi"

        // repeat
        System.out.println("ha".repeat(3)); // hahaha

        // lines - divide em stream de linhas
        "linha1\nlinha2\nlinha3"
            .lines()
            .forEach(System.out::println);

        // indent
        String indentado = "oi".indent(4);
        System.out.println(indentado); // "    oi"

        // formatted - igual String.format mas no objeto
        String msg = "Oi %s, voce tem %d anos!".formatted("Teste", 25);
        System.out.println(msg);
    }
}