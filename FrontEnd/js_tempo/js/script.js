let data = new Date();

console.log(data)


function ola(){
    alert("Olá pessoal!");
}

//dispara uma função, uma vez só, depois de um determinado tempo
//setTimeout(ola, 5000);


function aviso(){
    console.log("Eu avisei!");
}


//setInterval(aviso, 2000);


function tempo(){
    let hora = new Date();
    let relogio = document.querySelector("#div1");
    relogio.innerHTML = (hora.toLocaleString()).slice(-8);
}

//setInterval(tempo, 1000)
let intevalo;
document.querySelector("#iniciar").addEventListener("click", ()=>{
    intevalo = setInterval(tempo, 1000);
})

document.querySelector("#parar").addEventListener("click", ()=>{
    clearInterval(intevalo)
})