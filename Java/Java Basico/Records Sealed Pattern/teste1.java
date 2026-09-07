public class ComboModerno {

    // sealed + records juntos
    sealed interface Forma permits Circulo, Quadrado, Triangulo {}
    record Circulo(double raio) implements Forma {}
    record Quadrado(double lado) implements Forma {}
    record Triangulo(double base, double altura) implements Forma {}

    static String descrever(Forma forma) {
        return switch (forma) {
            case Circulo c when c.raio() > 10 -> 
                "Circulo grande de raio " + c.raio();
            case Circulo c -> 
                "Circulo pequeno de raio " + c.raio();
            case Quadrado q -> 
                "Quadrado de lado " + q.lado();
            case Triangulo t -> 
                "Triangulo " + t.base() + "x" + t.altura();
        };
    }

    public static void main(String[] args) {
        System.out.println(descrever(new Circulo(15)));   // Circulo grande
        System.out.println(descrever(new Circulo(5)));    // Circulo pequeno
        System.out.println(descrever(new Quadrado(4)));   // Quadrado de lado 4
        System.out.println(descrever(new Triangulo(3,6)));// Triangulo 3x6
    }
}