fn somar(a: i32, b: i32) -> i32 {
    a + b // sem return e sem ; = retorno implicito!
}

fn saudar(nome: &str) -> String {
    format!("Oi, {}!", nome)
}

fn main() {
    println!("{}", somar(5, 3));      // 8
    println!("{}", saudar("Teste")); 
}