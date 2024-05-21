//variaveis de tempo
let mn = 0;
let ss = 0;
let cc = 0;

//variaveis de controle
let cron;

let controle = 0;

//Variaveis de elementos
let cronometro = document.querySelector("#counter");
let ligar = document.querySelector("#ligar");
let parar = document.querySelector("#parar");
let pausar = document.querySelector("#pausar");

function timer(){
    cc++;
    if(cc == 100){
        ss++;
        cc = 0;

        if(ss == 60){
            mn++;
            ss = 0;
        }
    }
    let relogio = ("0" + mn).slice(-2) + ":" + ("0" + ss).slice(-2) + ":" + ("0" + cc).slice(-2);
    cronometro.innerHTML = relogio;
}

ligar.addEventListener("click", ()=>{
    if(controle == 0){
        cron = setInterval(timer, 10);
        controle++;
    }
    
})

pausar.addEventListener("click", ()=>{
    clearInterval(cron)
    controle = 0
})

parar.addEventListener("click", ()=>{
    clearInterval(cron)
    controle = 0
    mn = 0
    ss = 0
    cc = 0
    cronometro.innerHTML = "00:00:00"
})