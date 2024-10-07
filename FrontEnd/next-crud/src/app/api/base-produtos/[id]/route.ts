import { TipoProduto } from "@/types"
import { promises as f} from "fs"
import { NextResponse } from "next/server"


export async function GET(request:Request, {params}: {params:{id:number}}) {

    const file = await f.readFile(process.cwd() + "/src/data/base.json", "utf-8")

    const produtos:TipoProduto[] = JSON.parse(file)

    const produto = produtos.find(pro => pro.id == params.id)

    return NextResponse.json(produto)
}