export type Comp1Props = {
    curso:string;
    aviso: ()=>void;
}

export type CabecalhoProps = {
    status: "loading" | "deployed"
}