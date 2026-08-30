/*
========================
Estudo mais fundo de JS
Função 
========================
Closure = função que lembra do escopo
          onde foi criada, mesmo depois
          que esse escopo já encerrou
========================
*/

function teste(){
    const nome = "teste"
    console.log(nome)
}

function teste2(){
    const nome = "teste2"
    return function(){
        console.log(nome)
    }
}

// imprime teste2 mesmo o nome ja tendo morrido

const test3 = teste2()
test3()

function contador(){
    let count = 0;

    return {
        incrementar(){count++},
        descrementar(){count--},
        valor(){return count}
    }
}

const contador = contador()
contador.incrementar()
contador.incrementar()
contador.descrementar()
console.log(contador.valor())
console.log(count)

