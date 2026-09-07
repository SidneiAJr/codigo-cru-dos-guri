fn dividir(a: f64, b: f64) -> Option<f64> {
    if b == 0.0 {
        None
    } else {
        Some(a / b)
    }
}

fn main() {
    match dividir(10.0, 2.0) {
        Some(resultado) => println!("Resultado: {}", resultado),
        None => println!("Divisao por zero!")
    }

    // jeito curto
    if let Some(r) = dividir(10.0, 0.0) {
        println!("{}", r);
    } else {
        println!("Erro!");
    }
}