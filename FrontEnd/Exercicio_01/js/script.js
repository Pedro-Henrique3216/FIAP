let array = ["Pedro", "Joao", "Kaio", "Matheus", "Henrique"];

const [add, ordena, reverte, exclui] = document.querySelectorAll("button");

nome = document.querySelector("#name")

add.addEventListener("click", () => {
    if(verificaSeVazio(nome)){
        array.push(nome.value);
        retornaLista();
    }
    
})

ordena.addEventListener("click", () => {
    array.sort()
    retornaLista()
});

reverte.addEventListener("click", () => {
    array.reverse()
    retornaLista()
});

exclui.addEventListener("click", () => {
    if(verificaSeVazio(nome)){
        if(array.includes(nome.value)){
            position = array.indexOf(nome.value)
            array.splice(position, 1)
            retornaLista()
        }
    }
})

function verificaSeVazio(nome){
    return nome.value != ""
}

function retornaLista(){
    remover()
    const elementoPai = document.querySelector("ul")
    for(i = 0; i < array.length; i++){
        const li = document.createElement("li")
        const texto = document.createTextNode(array[i])
        li.appendChild(texto);
        elementoPai.appendChild(li)
    }
}


function remover() {
    const li = document.querySelectorAll("li")
    if(!li){
        return
    }

    li.forEach(x => x.parentElement.removeChild(x))
}

retornaLista()




