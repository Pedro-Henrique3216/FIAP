let texto = document.querySelector("#idTexto");
let resposta  = document.querySelector("#res")


texto.addEventListener("keydown", ()=>{
    resposta.innerHTML = ""
    texto.value = ""
})

texto.addEventListener("keyup", (e)=>{
    resposta.innerHTML = `A tecla ${texto.value} tem o valor: ${e.keyCode}`
})