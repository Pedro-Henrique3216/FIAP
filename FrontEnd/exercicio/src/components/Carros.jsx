import lamborghiniImg from "./../assets/lamborghini-.jpg"
import "./Carros.css"

function Carros(){

    return (
        <section>
            <img src={lamborghiniImg} alt="imagem de uma lamborghini uracan" />
            <div>
                <li>Lamborghini</li>
                <li>Uno</li>
                <li>Fiat</li>
                <li>Citroen</li>
                <li>Volkswaggen</li>
            </div>
            
        </section>

    )
}

export default Carros