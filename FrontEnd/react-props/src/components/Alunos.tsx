import styles from "./Alunos.module.css"
export default function Alunos({children} : {children: React.ReactNode}){
    
    return (
        <div className={styles.div1}>
            {children}
        </div>
    )
}