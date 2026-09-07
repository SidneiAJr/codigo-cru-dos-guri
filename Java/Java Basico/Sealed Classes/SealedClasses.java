public class SealedClasses {

    // sealed - controla quem pode herdar!
    sealed interface Forma permits Circulo, Quadrado, Triangulo {}

    record Circulo(double raio) implements Forma {}
    record Quadrado(double lado) implements Forma {}
    record Triangulo(double base, double altura) implements Forma {}

    static double area(Forma forma) {
        return switch (forma) {
            case Circulo c    -> Math.PI * c.raio() * c.raio();
            case Quadrado q   -> q.lado() * q.lado();
            case Triangulo t  -> (t.base() * t.altura()) / 2;
        };
    }

    public static void main(String[] args) {
        Forma circulo   = new Circulo(5);
        Forma quadrado  = new Quadrado(4);
        Forma triangulo = new Triangulo(3, 6);

        System.out.println(area(circulo));   // 78.53...
        System.out.println(area(quadrado));  // 16.0
        System.out.println(area(triangulo)); // 9.0
    }
}