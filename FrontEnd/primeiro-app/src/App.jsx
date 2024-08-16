import './App.css'
import Componente1 from './components/Componente1'


function App() {

  const aluno = "João"
  return (
    <>
      <h1>Ola Mundo</h1>
      <p>Primerira aula</p>
      <p>Cara</p>

      <p>O Aluno {aluno}</p>

      <Componente1 />
    </>
  )
}

export default App
