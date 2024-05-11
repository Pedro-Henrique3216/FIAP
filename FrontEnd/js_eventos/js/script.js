let botao = document.querySelector("#btn-aviso")

//botao.onclick = () => alert("Teste Click")

botao.addEventListener("click", clicou)
botao.addEventListener("mouseenter", entrou)
botao.addEventListener("mouseout", saiu)

function clicou(){
    botao.innerHTML = "Clicou, não entra nem sai mais"
    botao.removeEventListener("mouseenter", entrou)
    botao.removeEventListener("mouseout", saiu)
}

function entrou(){
    botao.innerHTML = "Entrou"
}

function saiu(){
    botao.innerHTML = "Saiu"
}

let botoes = document.querySelectorAll(".item")

botoes.forEach((item, i)=>item.addEventListener("click", ()=>{
    console.log("Clicou no botão " + (i+1))
}))



//function (){}
//()=>{}

