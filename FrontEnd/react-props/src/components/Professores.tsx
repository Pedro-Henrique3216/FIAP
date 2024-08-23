import { ListaProfessores } from "../types";
import style from "./Professores.module.css"

export default function Professores({nome, disciplina, ano, index}: ListaProfessores &{index:number}){
    return (
        <div key={index} className={style.Profs}>
            <p>nome: {nome}</p>
            <p>Disciplina: {disciplina}</p>
            <p>ano: {ano}</p>
        </div>
    )
}