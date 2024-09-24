import Link from "next/link";

export default function ListaServicos() {

    return (
        <div>
            <h2>Lista de seviços</h2>
            <ul>
                <li><Link href={"/servicos/manutencao"}>Manutencao</Link></li>
                <li>Instalação de Software</li>
                <li>Upgrades</li>
            </ul>
        </div>
    )
}