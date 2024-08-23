import { PropsAviso, PropsCabecalho } from "../types"

export default function Cabecalho ({titulo, capitulo, aviso}:PropsCabecalho & PropsAviso){

    const param = {
        color: "blue",
        fontSize: "20px"
    }

    return (
        <header className="div1">
            <h1>{capitulo} - {titulo}</h1>
            <p style={{ color : "red", backgroundColor: "#fcc"}}>Exemplo interno</p>
            <p style={param}>Paragrafo</p>
            <button onClick={aviso}>Ler Aviso</button>
        </header>
    )
}