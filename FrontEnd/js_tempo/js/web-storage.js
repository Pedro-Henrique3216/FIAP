
//window.localStorage
// setItem
// getItem
// removeItem
// clear

// relação de chave e valor
localStorage.setItem("nome", "Pedro Henrique");

let nome = localStorage.getItem("nome");

console.log(nome);

localStorage.removeItem("nome");

localStorage.setItem("nome", "Pedro Henrique");
localStorage.setItem("altura", "1.78");
localStorage.setItem("peso", "90kg");

// localStorage.clear()

let frutas = ["laranja", "banana", "maça"]

localStorage.setItem("lista", JSON.stringify(frutas))

let compras = localStorage.getItem("lista")
console.log(compras);

compras = JSON.parse(localStorage.getItem("lista"))
console.log(compras);