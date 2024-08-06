const alunos = [ "João", "Carlos", "Maria"];

// const grupos = [alunos, ["Igor", "Felipe", "Gustavo"]];



// const carros = [
//     {
//         modelo: "Civic",
//         marca: "Honda"
//     },
//     {
//         modelo: "Fusca",
//         marca: "Volkswagen"
//     },
//     {
//         modelo: "Uno",
//         marca: "Fiat"
//     }
// ];

alunos[alunos.length] = "Barbara";

alunos.push("Lucas"); //insere um item no final do array

let alunoExcluido = alunos.pop(); //apag p ultimo item do array e armazena na variavel

alunos.sort(); // coloca os itens em ordem crescente

alunos.sort().reverse(); // coloca os itens em ordem decrescente

alunos.unshift("Israel"); // insere um item no inicio do array

alunos.shift(); // apaga o primeiro item do array e guarda em uma variavel

alunos.splice(1, 0, "Junior", "Julio"); // insere 1 ou mais itens na posição escolhida no array

alunos.splice(2, 1, "Juliana"); // substitui um ou mais itens do array

let alunoExcluido2 = alunos.splice(1, 1); //apaga 1 ou mais itens da posição escolhida no array

console.log(alunos);

const cursos = [
    {nome: "HTML5", duracao: "3 meses"},
    {nome: "CSS3", duracao: "4 meses"},
    {nome: "Javascript", duracao: "5 meses"}
];

// const nomeCursos = cursos.map((curso) => {
//    return curso.nome
// });

const nomeCursos = cursos.map(curso => curso.nome); // percorre todo o array criando um novo com as alterações

const propCursos = cursos.map(curso => `O curso ${curso.nome} tem duração de ${curso.duracao}`);

const ordemCursos = cursos.map((curso, i) => `O curso ${curso.nome} deve ser o ${i+1}º a ser feito`);

console.log(ordemCursos);

const notasAlunos = [
    {nome: "Lucas", nota: 6},
    {nome: "João", nota: 8},
    {nome: "Maria", nota: 7},
    {nome: "Barbara", nota: 5},
    {nome: "Junior", nota: 4}
]

const alunoAprovados = notasAlunos.filter(alunos => alunos.nota >= 6);

console.log(alunoAprovados)

const frutas = ["maça", "banana", "pera", "maça", "goiaba", "banana", "uva", "morango", "uva"]

const frutasSelecionadas = frutas.filter((fruta, i, todas) => todas.indexOf(fruta) == i);

console.log(frutasSelecionadas);
