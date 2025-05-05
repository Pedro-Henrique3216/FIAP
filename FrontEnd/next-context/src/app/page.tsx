"use client"
import { AuthContext } from "@/context";
import { useContext } from "react";

export default function Home() {

  const {user, login, logout} = useContext(AuthContext)
  return (
    <main className="flex p-10 justify-center">
        <h1 className="text-3xl font-bold text-indigo-800">Home</h1>
        <p>Nome do usuario: {user?.nome}</p>
    </main>
  );
}
