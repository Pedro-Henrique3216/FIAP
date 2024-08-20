import Cabecalho from "./components/Cabecalho";
import Component1 from "./components/Component1";

function App() {

  //cabecalho
  const titulo:string = "React - Intro 2";
  const status = "loading";

  //componente 1
  let curso:string = "Javascript";
  curso = "Typescript";

  const aviso = () => {
    alert("Aviso do comonente app");
  };

  const unidade = "Paulista"; 

  return (
    <>
      <Cabecalho titulo={titulo} status={status}/>
      <Component1 curso={curso} aviso={aviso} unidade={unidade}>
        <h2>Lista de cursos</h2>
        <ul>
          <li>React</li>
          <li>Typescript</li>
          <li>Angular</li>
        </ul>
      </Component1>
    </>
    
  )
}

export default App
