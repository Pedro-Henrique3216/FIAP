
import { useState } from 'react'
import './App.css'
import ExemploEffect from './components/ExemploEffect'
import Aviao from './components/Aviao'

function App() {

  const [exemplo, setExemplo] = useState(true)

  return (
    <>
      <h1>React - Hooks - useEffect</h1>
      <button onClick={()=> (
        setExemplo(!exemplo)
      )}>
        { exemplo ? "Apagar Exemplo" : "Click me"}</button>
      {
        exemplo ? <ExemploEffect /> : ""
      }

      <button onClick={()=> (
        setExemplo(!exemplo)
      )}>
        { exemplo ? "Apagar Exemplo" : "Click me"}</button>
      {
        exemplo ? <Aviao /> : ""
      }

      
    </>
  )
}

export default App
