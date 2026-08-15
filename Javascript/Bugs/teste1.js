const array = ["mercurio","venus"]
const array2 = array.push("marte")

const filtro = array.map(item=>item.toLocaleLowerCase())

const comIndex = array.map((item, i) => `${i + 1}. ${item}`);

console.log(array2)
console.log(array)
console.log(filtro)
console.log(comIndex)
