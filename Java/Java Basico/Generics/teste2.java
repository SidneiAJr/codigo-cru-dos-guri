public class Main {
    public static void main(String[] args) {
        System.out.println(somar(10, 20));
        System.out.println(somar(1.5, 2.5));
    }

    public static <T extends Number> double somar(T a, T b) {
        return a.doubleValue() + b.doubleValue();
    }
}