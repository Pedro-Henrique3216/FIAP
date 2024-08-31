import styled  from "styled-components";


export const HeaderStyle = styled.header`
    padding: 2em 0;
    border-bottom: 0.2em solid gray;
    ul {
        display: flex;
        gap: 50px;
        justify-content: center;
    }

    a {
        display: inline-block;
        text-decoration: none;
        color: black;
        font-size: 2rem;
    }

    a:hover {
        transition: 1s;
        color: red;
        transform: scale(1.2);
    }
    
`