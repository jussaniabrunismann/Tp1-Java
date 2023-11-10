package org.infnet.agendamentos;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.infnet.clientes.Cliente;
import org.infnet.servicos.Servicos;

import java.util.Date;

@Data
public class Agendamento {
    private int id;
    private Date data;
    private Cliente cliente;
    private Servicos servico;

    public Agendamento(int id, Date data, Cliente cliente, Servicos servico) {
        this.id = id;
        this.data = data;
        this.cliente = cliente;
        this.servico = servico;
    }
}
