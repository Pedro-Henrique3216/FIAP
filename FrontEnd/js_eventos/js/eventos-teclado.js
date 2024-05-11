let texto = document.querySelector("#idTexto")

texto.addEventListener("keydown", ()=>{
    let resultado = document.querySelector("#res")
    resultado.innerHTML = ""
    texto.value = ""
})

texto.addEventListener("keyup", (e)=>{
    let resultado = document.querySelector("#res")
    resultado.innerHTML = `A tecla ${texto.value} = ${e.keyCode}`
})

