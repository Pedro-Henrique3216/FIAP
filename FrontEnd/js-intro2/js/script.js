console.log("Primeira saída");

console.log("Segunda saída");

function exibir(){
    console.log("Nova saida");
}

console.log("Terceira saída");

exibir()

function somar(num1 = 0, num2 = 0){
    return num1 + num2
}

console.log(somar(5));

let somarVarios = function(...nums){ // spread
    let soma = 0
    for(let n of nums){
        soma += n
    }

    return soma
}

console.log(somarVarios(3, 5, 8, 4, 5, 5));
console.log(typeof somarVarios);

//window.document.write("Estou escrevendo no documento")

let titulo = document.getElementById("titulo")
//titulo.style.color = "red"

//console.log(titulo);

let novo = document.getElementById("idNome")

function mudar(){
    titulo.innerHTML = novo.value
}

//*********************************************************** */

let btns = document.getElementsByClassName("exemplo")

console.log(btns[1]);


function inserir(){
    let numero = document.getElementById("posicao").value - 1
    let novo = document.getElementById("idnovo").value

    document.getElementsByClassName("corredor")[numero].innerHTML = novo
}

//*********************************************************** */

function mostrar(){
    let numero = document.getElementById("numero").value - 1
    let mes = document.getElementsByTagName("li")[numero].innerHTML

    document.getElementById("resultado").innerHTML = mes
}


//*********************************************************** */

let cabecalho = document.querySelector("#titulo") // retorna apenas a primeira ocorrência
console.log(cabecalho);

let elemento = document.querySelectorAll("button.exemplo")
console.log(elemento);