import { Outlet } from "react-router-dom"
import Header from "./components/Header"
import Rodape from "./components/Rodape"

function App() {
  
  const id:number = 2

  return (
    <>
      <Header id={id}/>
      <Outlet />
      <Rodape/>
    </>
  )
}

export default App
