public class Exceptions {

    // throws - avisa que pode lançar excecao
    static double dividir(double a, double b) throws ArithmeticException {
        if (b == 0) throw new ArithmeticException("Divisao por zero!");
        return a / b;
    }

    public static void main(String[] args) {

        // try/catch/finally
        try {
            double resultado = dividir(10, 0);
            System.out.println(resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            System.out.println("Sempre executa!");
        }

        // multiplos catch
        try {
            String s = null;
            s.length(); // NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Era nulo!");
        } catch (Exception e) {
            System.out.println("Erro generico: " + e.getMessage());
        }

        // excecao customizada
        try {
            throw new IllegalArgumentException("Argumento invalido!");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}