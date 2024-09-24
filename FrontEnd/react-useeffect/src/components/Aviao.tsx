import { useEffect, useState } from "react"

export default function Aviao(){

    const [altura, setAltura] = useState(0)
    const [estado, setEstado] = useState("")
    const [alteracao, setAlteracao] = useState("")

    useEffect(() => {
        setAlteracao("O avião decolou");
    })

    useEffect(() => {
        setEstado(`O avião esta em ${altura} pes`);

    }, [altura])

    useEffect(() => {
        setEstado("O avião está ligado")
    }, [setAltura])

    useEffect(() => {
        setAlteracao("O avião foi derrubado")
    }, [])

    return (
        <div>
            <h2>{alteracao}</h2>
            <h2>{estado}</h2>
            <p>{altura}</p>
            <button onClick={() => setAltura(altura + 100)}>Aumente Altura</button>
        </div>
    )
}