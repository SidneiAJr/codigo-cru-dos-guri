const usuario = {
  nome: "Pedro",
  endereco: {
    cidade: ""
  }
};

// ❌ jeito antigo — dá erro se endereco não existir
//console.log(usuario.endereco.cep.numero); // 💥 erro!

// ✅ com optional chaining — retorna undefined sem quebrar
console.log(usuario.endereco?.cep?.numero); // undefined, sem erro

// exemplo real do seu bot
const preco = data?.bitcoin?.brl; // se data for null não quebra