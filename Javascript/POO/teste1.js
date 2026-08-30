function Usuario(nome){
    this.nome = nome
}

Usuario.prototype.saudar = function(){
    console.log(`OI eu sou ${this.nome}`)
}

const user1 = new Usuario('Teste1')
const user2 = new Usuario('Teste2')

user1.saudar()
user2.saudar()