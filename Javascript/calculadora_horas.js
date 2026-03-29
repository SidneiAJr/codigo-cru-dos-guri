function CalculadorHora(){
    let totalhorasMateria = Number(prompt("Insira a carga horario da materia: "))
    let percentualdeprença = Number(prompt("Insira o Percentual de Presença pra aprovação: "))
    let totalhorassemana = Number(prompt("Total de Horas em uma Semana: "))
    let totalsemanas = Number(prompt("Quantidade de Aulas na Semana: "))
    let perc = percentualdeprença/100
    let totaldeaulasncessarias = totalhorasMateria*perc
    let totalaulas = totaldeaulasncessarias/totalhorassemana
    let totaldias = totalaulas*totalsemanas
    let arrendo = Math.ceil(totalaulas)
    let arrendo2 = Math.ceil(totaldias)
    console.log(`Total necessario de presença: ${percentualdeprença} % Quantidade de Aulas Necessarias ${arrendo} Total de Semanas ${arrendo2}`)
}
