fn main() {
    let numero = 3;

    match numero {
        1 => println!("um"),
        2 | 3 => println!("dois ou tres"),
        4..=10 => println!("entre 4 e 10"),
        _ => println!("outro")
    }

    // com retorno
    let texto = match numero {
        1 => "um",
        _ => "outro"
    };
    println!("{}", texto);
}