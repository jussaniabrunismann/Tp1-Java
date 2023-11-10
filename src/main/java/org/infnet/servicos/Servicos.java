package org.infnet.servicos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class Servicos {
    private int id;
    private String nome;
    private String descricao;
    private double preco;

    public Servicos(int id, String nome, String descricao, double preco) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }
}
