import java.util.List;

class Main {
    public static void main(String[] args) {
         List<String> itens = List.of(
    "Gato filosofando às 3am",
    "Geladeira vazia num domingo",
    "WiFi caindo na hora da entrega",
    "Primo que entende de tudo",
    "Reunião que podia ser email",
    "Bugs que somem quando chama o sênior",
    "Café frio na mesa",
    "Aquele 'dá pra fazer rápido' do cliente"
);
   
   itens.forEach(iten->System.out.println(iten));
   itens.stream()
   .map(iten->iten.toLowerCase())
   .filter(iten->iten.startsWith("g"))
   .forEach(iten->System.out.println(iten));
    }
}