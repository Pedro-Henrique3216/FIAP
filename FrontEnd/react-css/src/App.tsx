import './App.css'
import Cabecalho from './components/Cabecalho'
import Component2 from './components/Component2'
import Componente1 from './components/Componente1'

function App() {
  
  const paragr = {
    color: "green",
    background: "#bfb",
    padding: "15px"
  }

  return (
    <div className="div1">
      <Cabecalho/>
      <p style={{color: "red", backgroundColor: "#fbb", fontSize: "16px", display: "inline-block"}}>Estou aprendendo CSS no React</p>
      <p style={paragr}>Segundo Paragrafo</p>
      <Componente1/>
      <Component2/>
    </div>
  )
}

export default App
