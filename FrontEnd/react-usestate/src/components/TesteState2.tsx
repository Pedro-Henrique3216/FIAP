import { useState } from "react";

export default function TesteState2() {
    const [count, setCount] = useState(0)

    return (
        <div>

            <h2>Teste de Estado 2</h2>

            <p>Contagem: {count}</p>
            <button onClick={() => setCount(count + 1)}>Aumentar</button>
            <button onClick={() => setCount(count - 1)}>Diminuir</button>
        </div>
    )
}