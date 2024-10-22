import Image from "next/image";
import teste from "@/image/teste.png"

export default function Home() {
  return (
    <div>
      <Image src={teste} alt="testando imagens"/>

      <Image src="/image/teste.png" alt="imagem" height={1270} width={720}/>

      <img src="/image/teste.png" alt="imagem" />

      <Image src="https://media.gazetadopovo.com.br/2020/01/17155825/lamborghini-huracan-Alexander-Migl-wikimedia-commons-960x540.jpg" alt="teste" height={1720} width={650}/>
    </div>
  );
}
