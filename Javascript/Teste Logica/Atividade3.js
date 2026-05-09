let pessoa =[
    {nome: "Ju",idade:20},
    {nome: "pe", idade:30},
    {nome: "Lu",idade:15}
]

pessoa.sort((a,b)=>a.nome.localeCompare(b.nome));
console.log(pessoa)
