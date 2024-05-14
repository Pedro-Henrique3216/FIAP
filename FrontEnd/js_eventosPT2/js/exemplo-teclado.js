let px = 0;
let py = 0;
let obj = document.querySelector("#div1");

document.addEventListener("keydown", e => {
    obj.style.position = "absolute";
    let tecla = e.keyCode
    //37 esquerda - 38 cima - 39 direita - 40 baixo
    if(tecla == 37){
        px -= 10
        obj.style.left = px + "px"
    }else if(tecla == 38){
        py -= 10;
        obj.style.top = py + "px"
    }else if(tecla == 39){
        px += 10
        obj.style.left = px + "px"
    }else if(tecla == 40){
        py += 10
        obj.style.top = py + "px"
    }
})