import BookCard from './components/BookCard'
import Footer from './components/Footer'
import Header from './components/Header'
import { AppDivGlobal, AppMainStyle } from './style'
import { BookList } from './type'

function App() {

  const livro: BookList[] = [
    {titulo: "Vingadores", autor: "Tony", ano: 2015, img: "img-book-1 1.jpg"},
    {titulo: "Liga da Justiça", autor: "Brucy", ano: 2011, img: "img-book-2 1.jpg"},
    {titulo: "Flash", autor: "Barry", ano: 2021, img: "img-book-3 1.jpg"},
    {titulo: "Thor", autor: "Thor", ano: 2010, img: "img-book-4 1.jpg"},
    {titulo: "Rei Leão", autor: "Scar", ano: 2018, img: "img-book-5 1.jpg"}
  ]

  return (
    <AppDivGlobal>
        <Header />
        <AppMainStyle>
          {
            livro.map((livro, index) => (
              <BookCard key={index} titulo={livro.titulo} autor={livro.autor} ano={livro.ano} img={livro.img} />
            ))
          }
      </AppMainStyle>
      <Footer />
    </AppDivGlobal>
  )
}

export default App
