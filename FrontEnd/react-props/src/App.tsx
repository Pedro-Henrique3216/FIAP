import Cabecalho from "./components/Cabecalho.tsx"
import Alunos from "./components/Alunos.tsx"
import Professores from "./components/Professores.tsx";
import { ListaProfessores } from "./types.ts";
import "./App.css"

function App() {

  const titulo:string = "React - Aula de Props";

  const capitulo:number = 15

  const aviso = () => {
    alert("OI")
  } 

  const listaProf:ListaProfessores[] = [
    {nome: "Luiz", disciplina: "Fron-End", ano:1},
    {nome: "Carlos Freitas", disciplina: "Software Design", ano:1},
    {nome: "Thiago Yamamoto", disciplina: "Java Advanced", ano: 2}
  ]

  return (
    <div className="container">
      <Cabecalho titulo={titulo} capitulo={capitulo} aviso={aviso}/>
      <Alunos>
        <h2>Lista de Alunos</h2>
        <ul>
          <li>João</li>
          <li>Marcos</li>
          <li>Carlos</li>
          <li>Maria</li>
        </ul>
      </Alunos>
      <section>
        {
          listaProf.map((prof, index) =>(
            <Professores index={index} nome={prof.nome} disciplina={prof.disciplina} ano={prof.ano}/>
          )) 
        }
      </section>
      
    </div>
  )
}

export default App
