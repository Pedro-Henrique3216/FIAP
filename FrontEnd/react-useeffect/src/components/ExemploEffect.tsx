import { useEffect, useState } from "react"

export default function ExemploEffect() {
    const [count, setCount] = useState(0)

    const [contagem, setContagem] = useState(0)

    // é chamado sempre que há uma alteração no ciclo de vida
    useEffect( () => {
        console.log("Sempre sou chamado")
        }
    )

    // só é chamado quando o componente é criado
    useEffect(()=> {
        console.log("So sou chamado quando o componente for criado")
    }, [setCount])

    // so e chamado quando o valor ou valores do array sofrem alteração
    useEffect(()=> {
        if(count != 0){
            console.log(`O valor de count é : ${count}`)
        }
    }, [count])

    useEffect(()=> {
        return ()=>{
            console.log("Ops, me excluiram!!!!!");
        }
    }, [])


    return(
        <div>
            <h2>ExemploEffect</h2>
            <p>Valor de Count: {count}</p>
            <button type="button" onClick={() => setCount(count + 1)}>Aumentar</button>
            <p>O valor de contagem: {contagem}</p>
            <button type="button" onClick={() => setContagem(contagem + 1)}>Aumantar Contagem</button>
        </div>
    )
       
}