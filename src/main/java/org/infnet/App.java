package org.infnet;

import org.infnet.clientes.Cliente;
import org.infnet.servicos.Servicos;
import org.infnet.agendamentos.Agendamento;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        // Serviços disponíveis
        Servicos limpezaDePele = new Servicos(1, "Limpeza de Pele", "Limpeza profunda da pele", 150.0);
        Servicos massagemRelaxante = new Servicos(2, "Massagem Relaxante", "Massagem para relaxamento muscular", 200.0);

        // Dados do cliente
        System.out.println("Digite o nome completo do cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite o CPF do cliente sem pontos e traços, somente utilizar números:");
        String cpfCliente = scanner.nextLine();

        System.out.println("Digite a data de nascimento do cliente no formato indicado (dd/MM/yyyy):");
        String dataNascInput = scanner.nextLine();
        Date dataNascCliente = null;
        try {
            dataNascCliente = sdf.parse(dataNascInput);
        } catch (ParseException e) {
            e.printStackTrace();
            return; // Data em formato inválido
        }

        System.out.println("Digite o telefone do cliente:");
        String telefoneCliente = scanner.nextLine(); // Consume the newline left-over

        System.out.println("Digite o endereço do cliente:");
        String enderecoCliente = scanner.nextLine();


        Cliente cliente = new Cliente(1, nomeCliente, cpfCliente, dataNascCliente, telefoneCliente, enderecoCliente, new ArrayList<Agendamento>());

        // Escolha do serviço
        System.out.println("Escolha um serviço: [1] Limpeza de Pele, [2] Massagem Relaxante");
        int escolhaServico = scanner.nextInt();
        Servicos servicoEscolhido = escolhaServico == 1 ? limpezaDePele : massagemRelaxante;

        // Data do agendamento
        System.out.println("Digite a data do agendamento (dd/MM/yyyy):");
        scanner.nextLine(); // Consume the newline left-over
        String dataAgendInput = scanner.nextLine();
        Date dataAgendamento = null;
        try {
            dataAgendamento = sdf.parse(dataAgendInput);
        } catch (ParseException e) {
            e.printStackTrace();
            return; // Sair do método se a data estiver em formato inválido
        }

        // Criação agendamento
        Agendamento agendamento = new Agendamento(1, dataAgendamento, cliente, servicoEscolhido);

        // Confirmação agendamento
        System.out.println("Agendamento realizado com sucesso!");
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Serviço: " + servicoEscolhido.getNome());
        System.out.println("Data: " + sdf.format(agendamento.getData()));

        scanner.close();
    }
}

