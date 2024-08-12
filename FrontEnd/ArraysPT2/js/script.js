
const carros = ["Gol", "Celta", "Palio", "Fiesta"];

// Splice = inserir um novo item
carros.splice(1, 0, "Uno")

//Splice = substitui um ou mais elementos
carros.splice(2, 1, "Corsa", "Citroen")

console.log(carros)

//Splice = apaga um ou mai itens do array
const retirados = carros.splice(4, 1)

console.log(retirados)

console.log(carros);

const alunos = [
    { nome: "Lucas", idade: 17, nota: 7 },
    { nome: "Alan", idade: 15, nota: 9 },
    { nome: "Ricardo", idade: 18, nota: 4 },
    { nome: "Ana", idade: 17, nota: 3 },
    { nome: "Maria", idade: 17, nota: 6 }
]


const nomesAlunos = alunos.map(aluno => aluno.nome)
console.log(nomesAlunos)

function compararNumero(notaA, notaB) {
    if (notaA > notaB) {
        return 1
    } else if (notaA < notaB) {
        return -1
    } else {
        return 0
    }
}

const alunosAprovados = alunos.filter(alunos => alunos.nota >= 6)
    .sort((alunoA, alunoB) => compararNumero(alunoA.nota, alunoB.nota))
    .map(alunos => `O aluno ${alunos.nome} foi aprovado com média ${alunos.nota}`)
console.log(alunosAprovados)

const vendedores = [
    { nome: "Janaina", idade: 21, venda: 5 },
    { nome: "Vitoria", idade: 19, venda: 7 },
    { nome: "Marcelo", idade: 23, venda: 3 },
    { nome: "Henrique", idade: 22, venda: 9 }
]

const totalVendas = vendedores.reduce((acumulador, vendedor) => acumulador + vendedor.venda, 0)
console.log(totalVendas);

const dadosVendas = vendedores.reduce((acumulador, vendedor) => {
    const maisNovo = acumulador.maisNovo < vendedor.idade ? acumulador.maisNovo : vendedor.idade
    const maisVelho = acumulador.maisVelho > vendedor.idade ? acumulador.maisVelho : vendedor.idade
    return {
        totalVenda: totalVendas + vendedor.venda,
        maisNovo, // como os nomes são iguais o JS entende e atribui de forma automatica
        maisVelho: maisVelho
    }
}, { totalVendas: 0, maisNovo: undefined, maisVelho: undefined })

console.log(dadosVendas)

const filaBrinquedo = [
    { nome: "Sara", idade: 16, altura: 1.50 },
    { nome: "Luciana", idade: 17, altura: 1.70 },
    { nome: "Kleber", idade: 15, altura: 1.65 },
    { nome: "Anderson", idade: 18, altura: 1.80 },
]


const todaFilaPode = filaBrinquedo.every(pessoa => pessoa.altura >= 1.60)
console.log(todaFilaPode ? "vamos lá" : "Nem todos podem");

const verifIdade = filaBrinquedo.some(pessoa => pessoa.idade >= 18)
console.log(verifIdade ? "Todos podem participar" : "Não temos responsaveis");

const responsavel = filaBrinquedo.find(pessoa => pessoa.idade >= 18)

console.log(responsavel)


const convidados = [
    "Luciana", "Carlos", "Miguel", "prof Luis", "prof Guilherme"
]

const profConvidados = convidados.filter(conv => conv.includes("prof"))
console.log(profConvidados);

const frutas = ["maça", "banana", "uva"]
const verduras = ["couve", "alface", "agrião"]


//spread

const feira = [...frutas, ...verduras, "rucula"]
console.log(feira);

let pessoa = {
    nome: "André",
    idade: 21,
    altura: 1.80
}

pessoa = {
    ...pessoa,
    idade: 25
}

console.log(pessoa);

