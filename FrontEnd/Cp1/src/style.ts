import styled from "styled-components"

export const BookCardStyle = styled.section`
    padding: 1.5em;
    display: flex;
    flex-direction: column;
    gap: 20px;
    border: 2px solid white;
    align-items: center;
    width: 20%;

    img {
        max-width: 100%;
    }

`

export const AppDivGlobal = styled.div`
    min-height: 100vh;
    display: flex;
    flex-direction: column;
    background-color: #555;
`

export const AppMainStyle = styled.main`
    display: flex;
    justify-content: center;
    flex-grow: 1;
    align-items: center;
    gap: 20px;
    padding: 2em;

`

export const HeaderStyle = styled.header`
    text-align: center;
    background-color: royalblue;
    padding: 2em;

`

export const FooterStyle = styled.footer`
    display: flex;
    justify-content: center;
    gap: 20px;
    padding: 2em;
    background-color: royalblue;
`


