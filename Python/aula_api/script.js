const [id, buttonBuscar, modelo, montadora, ano, placa, buttonAltera] = document.querySelectorAll("input")


buttonBuscar.addEventListener("click", async () => {
    idValue = id.value
    if(id === ""){
        alert("Preecha com um valor")
    } else{
        const data = await get(idValue)
        if(data != null){
            modelo.value = data["modelo"]
            montadora.value = data["montadora"]
            ano.value = data["ano"]
            placa.value = data["placa"]
        }
    }
})

buttonAltera.addEventListener("click", (e) => {
    e.preventDefault()
    data = {id: id.value, modelo: modelo.value, montadora: montadora.value, ano: ano.value, placa: placa.value}
    put(data)
})

const get = async (id) => {
   const response = await fetch(`http://localhost:5000/carros/oracle/${id}`)
   if(response.status == 404){
    alert("ID Não encontrado")
    return null
   } else {
        return response.json()
   }
  
    
}

const put = async (data) => {
    try {
        const response = await fetch(`http://localhost:5000/carros/oracle`, {
            method: 'PUT',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(data)
        });
    
        if (response.status === 404) {
            alert("ID não encontrado");
        } else if (!response.ok) {
            alert(`Erro: ${response.status} - ${response.statusText}`);
        } else {
            const updatedData = await response.json();
            console.log('Atualização bem-sucedida:', updatedData);
        }
    } catch (error) {
        console.error('Erro ao fazer a requisição:', error);
    }
}




