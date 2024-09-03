import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import App from './App.tsx'
import './index.css'
import GlobalStyle from './globalStyle.ts'

import { createBrowserRouter, RouterProvider, Navigate } from 'react-router-dom'

import Home from './routes/Home/index.tsx'
import Produtos from './routes/Produtos/index.tsx'
import Error from './routes/Error/index.tsx'
import EditarProdutos from './routes/EditarProdutos/index.tsx'

const router = createBrowserRouter([
  {
    path: "/",
    element: <App/>,
    errorElement: <Error/>,
    children: [
      {
        path: "/",
        element: <Home/>,
      },
      {
        path: "/produtos",
        element: <Produtos/>,
      },
      {
        path: "produtos/editar/:id",
        element: <EditarProdutos/>,
      },
      {
        path: "/antiga",
        element: <Navigate to="/"/>
      }
    ]
  }
])

createRoot(document.getElementById('root')!).render(
  <StrictMode>
    <RouterProvider router={router}/>
    <GlobalStyle/>
  </StrictMode>,
)

