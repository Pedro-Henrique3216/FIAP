let nome = document.querySelector("#idNome")
let span = document.querySelector("#acao")

nome.addEventListener("focus", ()=>{
    nome.style.outlineColor = "blue"
    span.innerHTML = "O usuario acessou o campo"
})

nome.addEventListener("blur", ()=>{
    nome.style.borderColor = "red"
    span.innerHTML = "O usuario saiu do campo"
})

let barra = document.querySelector("#idBarra")
let valor = document.querySelector("#idValor")

// barra.addEventListener("change", ()=>{
//     valor.innerHTML = barra.value
// })

barra.addEventListener("input", ()=>{
    valor.innerHTML = barra.value
})

let form = document.querySelector("#idForm")

form.addEventListener("submit", ()=>{
    alert('Obrigado por participar da nossa pesquisa')
})