package br.com.fiap.infra;

import br.com.fiap.models.Pessoa;

import java.util.HashMap;
import java.util.Map;

public class FakeDb {

    public static Map<Long, Pessoa> pessoa = new HashMap<>();
}
