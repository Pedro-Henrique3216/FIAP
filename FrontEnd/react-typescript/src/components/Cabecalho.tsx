import { CabecalhoProps } from "../types";

export default function Cabecalho (props:{titulo:string} & CabecalhoProps) {

    document.title = props.titulo;

    return (

        <header>
            <h1>{props.titulo}</h1>
            <h2>Status: {props.status}</h2>
        </header>

    )
}