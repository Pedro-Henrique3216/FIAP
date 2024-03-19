package Java.Semana2;

public class Main {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João", 25);

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());

        pessoa.setNome("Maria");
        pessoa.setIdade(30);

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
    }
}
