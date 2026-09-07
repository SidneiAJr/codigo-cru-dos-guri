struct User {
    nome: String,
    idade: u32,
}

impl User {
    fn novo(nome: &str, idade: u32) -> User {
        User {
            nome: String::from(nome),
            idade,
        }
    }

    fn saudar(&self) -> String {
        format!("Oi, sou {} e tenho {} anos!", self.nome, self.idade)
    }
}

fn main() {
    let user = User::novo("Teste", 42);
    println!("{}", user.saudar());
}