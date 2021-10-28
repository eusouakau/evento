package view;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import controle.Comando;
import controle.ListaEventos;
import eventos.Evento;
import util.Situacao;

public class PesquisarEventoSitu implements Comando {
	ArrayList<Evento> listaEventos = ListaEventos.getInstance().getListaEventos();

	public PesquisarEventoSitu() {
	}

	public void pesquisarEventoSitu() {
		Situacao situEvento = Situacao.values()[Integer
				.parseInt(JOptionPane.showInputDialog("Informe a situa��o do evento:"))];
		boolean flag = false;

		if (listaEventos.isEmpty())
			JOptionPane.showMessageDialog(null, "N�o h� eventos nesta situa��o!");
		else {
			for (Evento evento : listaEventos) {
				if (evento.getSituacao() == situEvento) {
					JOptionPane.showMessageDialog(null, "Evento localizado: " + evento.toString());
					flag = true;
				}
			}
			if (!flag)
				JOptionPane.showMessageDialog(null, "Evento inexistente!");
		}
	}

	@Override
	public void executar() {
		pesquisarEventoSitu();
	}

}
