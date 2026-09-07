public class SwitchExpressions {

    enum Dia { SEG, TER, QUA, QUI, SEX, SAB, DOM }

    public static void main(String[] args) {

        Dia dia = Dia.SEX;

        // switch antigo - verboso
        String tipo1;
        switch (dia) {
            case SEG: case TER: case QUA: case QUI: case SEX:
                tipo1 = "Dia util";
                break;
            default:
                tipo1 = "Final de semana";
        }

        // switch moderno - direto!
        String tipo2 = switch (dia) {
            case SEG, TER, QUA, QUI, SEX -> "Dia util";
            case SAB, DOM -> "Final de semana";
        };

        System.out.println(tipo2); // Dia util

        // com bloco e yield
        int horas = switch (dia) {
            case SEG, TER, QUA, QUI, SEX -> 8;
            case SAB -> {
                System.out.println("Sabado!");
                yield 4; // retorno do bloco
            }
            case DOM -> 0;
        };

        System.out.println("Horas: " + horas); // 8
    }
}