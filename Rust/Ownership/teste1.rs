fn main() {
    let s1 = String::from("oi");
    let s2 = s1; // s1 foi MOVIDO pra s2!
    
    // println!("{}", s1); // ERRO! s1 não existe mais
    println!("{}", s2); // ok!

    // pra copiar de verdade usa clone
    let s3 = String::from("oi");
    let s4 = s3.clone(); // copia real
    
    println!("{} {}", s3, s4); // ambos ok!
}