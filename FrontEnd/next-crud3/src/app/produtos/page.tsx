"use client"
import { TipoProduto } from "@/types"
import { error } from "console"
import Link from "next/link"
import { useRouter } from "next/navigation"
import { useEffect, useState } from "react"
import Modal from "./model"
import { FaFileInvoice, FaTrashAlt } from "react-icons/fa"

export default function Produtos(){

    const [lista, setLista] = useState<TipoProduto[]>([])

    const navigate = useRouter()

    const [open, setOpen] = useState(false)
    const [idDelete, setIdDelete] = useState(0)

    const idModal = (id:number) => {
        setOpen(true)
        setIdDelete(id)
    }

    useEffect(()=>{
        const chamadaApi = async () => {
            const response = await fetch("http://localhost:3000/api/base-produtos")
            const data = await response.json()
            setLista(data)
            console.log(data);            
        }
        chamadaApi()
    },[])

    const handleDelete = async (id:number) => {
        try {
            const cabecalho = {
                method: "DELETE"
            }
            const response = await fetch(`http://localhost:3000/api/base-produtos/${id}`, cabecalho)
            if(response.ok){
                const data = await response.json()
                setOpen(false)
                window.location.reload()
            } else {
                alert("erro ao deletar produto")
                setOpen(false)
                navigate.push("/produtos")
            }
            
        } catch(error){
            console.error(error)
        }
       
    }  

    return(
        <main className="grow p-5">
            <h1 className="text-center text-4xl font-bold text-indigo-600 mb-4">Produtos</h1>
            <table className="w-2/3 m-auto">
                <thead className="bg-slate-900 text-white">
                    <tr>
                        <th>Id</th><th>Nome</th><th>Preço</th><th>estoque</th><th></th>
                    </tr>
                </thead>
                <tbody>
                    {
                        lista.map(p=>(
                            <tr key={p.id}>
                                <td>{p.id}</td>
                                <td>{p.nome}</td>
                                <td>{p.preco}</td>
                                <td>{p.estoque}</td>
                                <td className="flex justify-center items-center gap-2">
                                    <Link title="Editar" className="text-blue-700" href={`/produtos/produto/${p.id}`}><FaFileInvoice /></Link>
                                    {" | "}
                                    <button title="Excluir" onClick={() => idModal(p.id)}><FaTrashAlt /></button>
                                </td>
                                
                            </tr>
                        ))
                    }
                </tbody>
                <tfoot className="bg-black text-white">
                    <tr>
                        <td colSpan={5}>Total de Produtos: {lista.length}</td>
                    </tr>
                </tfoot>
            </table>
            
            <Modal open={open} onClose={() => setOpen(false)}>
                <div className="text-center w-56">
                    <FaTrashAlt size={56} className="mx-auto text-red-500" />
                    <h3 className="text-lg font-black text-gray-800">Excluir Produto?</h3>
                    <p className="text-gray-500 text-sm">Voce tem certeza que deseja excluir o produto</p>
                </div>

                <div className="flex gap-16">
                    <button className="btn .btn-danger w-full" onClick={() => handleDelete(idDelete)}>Sim</button>
                    <button className="btn btn-light w-full" onClick={() => setOpen(false)} >Não</button>
                </div>
            </Modal> :
        
            
        </main>
    )
}

