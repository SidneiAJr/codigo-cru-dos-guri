public class Teste {
    public static void main(String[] args) {
        Operacao soma = new Operacao() {
            @Override
            public int executar(int a, int b) {
                return a + b;
            }
        };
        System.out.println(soma.executar(5, 3));  // Saída: 8
    }
}
