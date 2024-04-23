//alert("Terceiro olá mundo!!!")

//document.write("<p>Quarto olá mundo!!!</p>")

console.log("Quinto olá mundo!!!")

let nome = "Pedro Henrique" //String
console.log(nome)

let preco = 17.95 //Number
console.log(preco);

let quant = 45 //Number
console.log(quant);

let casado = true //Boolean
console.log(casado);

let frutas = ['maça', 'banana', 'pera', 'uva'] //Arrays
console.log(frutas);
console.log(frutas[1]);

let carro = { //Class
    cor: "Preta",
    marca: "Honda",
    modelo: "Civic",
    porta: 4,

    correr: function() { //Funções
        alert("Estou correndo!!!!")
    }
}

console.log(carro);
console.log(carro.marca);
carro.correr()