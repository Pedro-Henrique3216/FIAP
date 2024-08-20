import React from "react";
import { Comp1Props } from "../types"


//interface

interface Comp1Unidade {
    unidade: "Paulista" | "Aclimação";
    children: React.ReactNode;
}


export default function Component1({curso, aviso, unidade, children}:Comp1Props & Comp1Unidade) {

    return (

        <div>
            {children}
            <p>Introdução do react com Typescript</p>
            <p>O curso é de {curso}</p>
            <p>Este curso será oferecido na unidade <b>{unidade}</b></p>
            <button onClick={aviso}>Clique aqui</button>
        </div>
    )
    
}