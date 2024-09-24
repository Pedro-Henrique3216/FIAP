import { listaProdutos } from "@/listaProdutos";
import Link from "next/link";

export default function Produtos() {
    
    return (
        <main>
            <h1>Produtos</h1>
            {
                listaProdutos.map(produto =>(
                    <p key={produto.id}>{`o produto ${produto.nome} custa ${produto.preco} reais`} - - <Link href={`/produtos/editar/${produto.id}`}>Editar</Link>
                    </p>
                ))
            }
        </main>
    )
}