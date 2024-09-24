"use client"
import { listaProdutos } from "@/listaProdutos"
import { ProdutosProp } from "@/types"
import { useParams } from "next/navigation"

export default function EditarProdutos() {

    const {id} = useParams()
    const idProd:number = Number(id)

    const prod:ProdutosProp = listaProdutos.filter(x => x.id === idProd)[0]
    
    return (
        <main>
            <h1>Editar Produtos</h1>
            <p>{`Produto: ${prod.nome}, Preço ${prod.preco} esta pronto para ser editado`}</p>
        </main>
    )
}