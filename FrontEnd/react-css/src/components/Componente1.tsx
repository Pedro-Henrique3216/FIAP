import styled from "styled-components"

const DivCom1 = styled.div`
    border: 2px solid lime;
    background-color: #333;
    padding: 15px;

    /* Nesting = Recurso que aninha os seletores CSS */
    h2{
        color: lime;
    }

    p {
        color: white;
        font-size: 1.3em;
    }
`


export default function Componente1(){
    return (
        <DivCom1>
            <h2>Componente 1</h2>
            <p>Este é o componente 1</p>
        </DivCom1>
    )
}