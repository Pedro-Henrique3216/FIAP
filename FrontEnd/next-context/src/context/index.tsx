"use client"
import { createContext, useState } from "react";

export type UserProps = {
    nome:string
    senha: string
}

type AuthContextProps = {
    user:UserProps | null
    login: (user:UserProps)=>void
    logout: ()=>void

}

const AuthContext = createContext<AuthContextProps>({} as AuthContextProps)

const AuthProvider = ({children}:{children:React.ReactNode}) => {

    const [user, setUser] = useState<UserProps>(
       {nome: "Jao", senha:""}
    )

    const login = (user:UserProps) => {
        setUser(user)
    }

    const logout = () => {
        setUser({nome: "", senha: ""})
    }

    return(
        <AuthContext.Provider value={{user, login, logout}}>
            {children}
        </AuthContext.Provider>
    )
}

export {AuthProvider, AuthContext}