//spread - espalha

const fruta = ["pera", "goiaba", "abacaxi"];

const legumes = ["batata", "cenoura", "mandioca"];

const feira = [...fruta, ...legumes];

console.log(feira);

let carro = {
    marca: "fiat",
    cor: "azul",
    ano: 2020
};


carro = {...carro, marca: "Ford"}

carro = {...carro, modelo: "Fiesta"}

console.log(carro);


// Rest Parameter **********************************

function soma(...args){
    return args.reduce((acc, item) => acc + item, 0)
}

console.log(soma(5, 7, 12, 5, 8));

// Destructuring

let alunos = ["Adriano", "Bianca", "Carolina"]

let [aluno1, aluno2, aluno3] = alunos

console.log(aluno1)

let car1, car2, car3, car4

// [car1, car2, car3, car4] = ["Civic", "Cruze", "Corola", "Sentra"]

[car1 = "X1", car2 = "A4", car3 = "Corvetti", car4 = "Mustang"] = ["Civic", , "Corola"]

console.log(car1);
console.log(car2);
console.log(car3);
console.log(car4);

const exemploFilmes = {
    ficcao: "Harry Potter",
    terror: "Exorcista",
    comedia: "O Poderoso chefão"
}

let {ficcao, terror } = exemploFilmes

ficcao = "Star wars"

console.log(`O Filme ${ficcao} está em cartaz`);
console.log(`O Filme ${terror} está em cartaz`);


// CreateElement

const titulo = document.createElement("h1")

const texto = document.createTextNode("Titulo da pagina")
titulo.appendChild(texto)

// titulo.textContent = "Titulo da pagina"

// titulo.innerHTML = "Titulo da pagina"

titulo.setAttribute("id", "titulo")

document.querySelector("body").appendChild(titulo)
