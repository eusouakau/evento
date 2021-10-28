package view;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import controle.*;
import eventos.*;
import pessoas.Participante;
import util.Situacao;

public class CadastrarEvento implements Comando {

	public CadastrarEvento() {
	}

	public void cadastrar() {
		String nomeEvento = JOptionPane.showInputDialog("Informe o nome do evento: ");
		double taxaInscricao = Double
				.parseDouble(JOptionPane.showInputDialog("Informe o valor da taxa de inscrição: "));
		String data = JOptionPane.showInputDialog("Informe a data do evento: ");

		Situacao situacao = situacao();

		String instituicao = JOptionPane.showInputDialog("Informe o nome da instituição onde ocorrerá o evento: ");
		String telefoneInst = JOptionPane.showInputDialog("Informe o telefone da instituição: ");
		String organizador = JOptionPane.showInputDialog("Informe o organizador do evento: ");

		Local local = new Local(instituicao, telefoneInst, organizador);

		ArrayList<Participante> participantes = new ArrayList<Participante>();
		int qtdParticipantes = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de participantes:"));
		for (int cont = 0; cont < qtdParticipantes; cont++) {
			String nome = JOptionPane.showInputDialog("Informe o nome do participante: ");
			String cpf = JOptionPane.showInputDialog("Informe o cpf do participante: ");
			String endereco = JOptionPane.showInputDialog("Informe o endereco do participante: ");
			String telefone = JOptionPane.showInputDialog("Informe o telefone participante: ");
			String email = JOptionPane.showInputDialog("Informe o email do participante: ");

			participantes.add(new Participante(endereco, telefone, cpf, email, nome));
		}
		Evento evento = new Evento(nomeEvento, taxaInscricao, data, local, participantes, situacao);

		while (evento.validarData() == false) {
			JOptionPane.showMessageDialog(null, "Data inválida!");
			data = JOptionPane.showInputDialog("Informe a data do evento: ");
			evento.setData(data);

		}
		ListaEventos.getInstance().getListaEventos().add(evento);

		JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");

	}

	@Override
	public void executar() {
		cadastrar();
	}

	public static Situacao situacao() {
		String opcao = "";

		opcao += ("Informe a situação: \n");
		for (Situacao value : Situacao.values()) {
			opcao += value.getDescricao() + "\n";
		}

		return Situacao.values()[Integer.parseInt(JOptionPane.showInputDialog(opcao)) - 1];
	}
}
