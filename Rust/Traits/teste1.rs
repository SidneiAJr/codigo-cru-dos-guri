trait Voavel {
    fn voar(&self) -> String;
}

trait Nadavel {
    fn nadar(&self) -> String {
        String::from("nadando...")
    }
}

struct Pato {
    nome: String,
}

impl Voavel for Pato {
    fn voar(&self) -> String {
        format!("{} voando!", self.nome)
    }
}

impl Nadavel for Pato {}

fn main() {
    let pato = Pato { nome: String::from("Teste") };
    println!("{}", pato.voar());
    println!("{}", pato.nadar());
}