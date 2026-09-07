class Main {
    public static void main(String[] args) {
        Utils.imprimirDois("Ola", "Mundo");  // T vira String
Utils.imprimirDois(1, 2);            // T vira Integer
Utils.imprimirDois(1.5, 3.14);       // T vira Double
    }
}

class Utils{
    public static <T> void imprimirDois(T a,T b){
        System.out.println(a);
        System.out.println(b);
    }
}