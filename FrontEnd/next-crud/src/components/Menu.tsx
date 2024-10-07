import Link from "next/link";

export default function Menu() {
    return(
        <nav>
            <ul>
                <li><Link href="/">HOME</Link></li>
                <li><Link href={"/produtos"}>Produtos</Link></li>
                <li><Link href={"/produtos/cad-produtos"}>Cadastro de Produtos</Link></li>
            </ul>
        </nav>
    )
}