import { Link } from "react-router-dom"
import { HeaderStyle } from "../styled"

export default function Header({id}: {id:number}){

    return (
        <HeaderStyle>
            <nav>
                <ul>
                    <li>
                        <Link to="/">Home</Link>
                    </li>
                    <li>
                        <Link to="/produtos">Produtos</Link>
                    </li>
                    <li>
                        <Link to={`/produtos/editar/${id}`}>Editar Produtos</Link>
                    </li>
                </ul>
            </nav>
        </HeaderStyle>
    )
}