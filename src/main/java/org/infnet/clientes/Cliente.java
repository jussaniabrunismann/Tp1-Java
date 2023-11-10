package org.infnet.clientes;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.infnet.agendamentos.Agendamento;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
public class Cliente {
    private int id;
    private String nome;
    private String cpf;
    private Date dataNascimento;
    private String telefone;
    private String endereco;
    private List<Agendamento> agendamentos = new ArrayList<>();

}
