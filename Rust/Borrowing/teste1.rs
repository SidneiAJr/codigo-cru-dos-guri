fn imprimir(s: &String) {
    println!("{}", s);
}

fn main() {
    let s = String::from("Teste");
    imprimir(&s);
    println!("{}", s);
}