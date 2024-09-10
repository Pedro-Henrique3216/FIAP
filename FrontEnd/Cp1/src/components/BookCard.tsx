import { BookCardStyle } from "../style";
import { BookList } from "../type";

export default function BookCard({titulo, autor, ano, img} : BookList) {
    return (
        <BookCardStyle>
            <h1>{titulo}</h1>
            <img src={img} alt={`Imagem do filme ${titulo}`}/>
            <h2>{autor}</h2>
            <h3>{ano}</h3>
        </BookCardStyle>
    )
}