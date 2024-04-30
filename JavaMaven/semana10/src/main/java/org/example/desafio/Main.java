package org.example.desafio;

import org.example.desafio.domain.Estagiario;
import org.example.desafio.domain.Funcionario;
import org.example.desafio.domain.Gerente;
import org.example.desafio.domain.Vendedor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Gerente gerente = new Gerente(2100);
        Vendedor vendedor = new Vendedor(2100);
        Estagiario estagiario = new Estagiario(2100);

        System.out.println(gerente.calcularSalario());
        System.out.println(vendedor.calcularSalario());
        System.out.println(estagiario.calcularSalario() + "\n\n");

        List<Funcionario> funcionarios = new ArrayList<>(Arrays.asList(gerente, vendedor, estagiario));
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario.calcularSalario());
        }

    }
}
