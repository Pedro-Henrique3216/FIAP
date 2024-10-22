import Carrosel from "@/components/Corrosel";


export default function Home() {
  return (
    <main className="grow flex flex-col gap-6 justify-center items-center p-6 bg-indigo-700/30">
      <h1 className="text-center text-3xl text-indigo-600 font-bold">Home</h1>
      <Carrosel />
    </main>
  );
}
