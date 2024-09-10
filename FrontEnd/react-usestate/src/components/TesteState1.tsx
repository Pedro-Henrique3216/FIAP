import { useState } from "react"

export default function TesteState1() {

    const [nome, setNome] = useState("João")  

    return (

        <div>
            <h2>Teste State 1</h2>

            <p>Nome do usuario é {nome}</p>
            <button onClick={() =>  setNome("Pedro")}>Clique me</button>
        </div>

    )
}