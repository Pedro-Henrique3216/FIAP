"use client"
import { TipoProduto } from "@/types"
import Link from "next/link"
import { useEffect, useState } from "react"

export default function Produtos(){
    const [lista, setLista] = useState<TipoProduto[]>([])

    useEffect(() => {
        const chamadaApi = async () => {
            const response = await fetch("http://localhost:3000/api/base-produtos")
            const data = await response.json()
            setLista(data)
        }
        chamadaApi()
    }, [])
    


    return (
        <main>
            <h1>Produtos</h1>
            <table>
                <thead>
                    <tr>
                        <th>Id</th>
                        <th>Nome</th>
                        <th>Preço</th>
                        <th>Estoque</th>
                        <th>Editar</th>
                    </tr>
                </thead>
                <tbody>
                    {
                        lista.map(prod => (
                            <tr key={prod.id}>
                                <td>{prod.id}</td>
                                <td>{prod.nome}</td>
                                <td>{prod.preco}</td>
                                <td>{prod.estoque}</td>
                                <td><Link href={`/produtos/produto/${prod.id}`}>Editar</Link></td>
                            </tr>
                        ))
                    }
                </tbody>
            </table>
            
        </main>
    )
}