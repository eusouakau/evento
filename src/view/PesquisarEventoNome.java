package view;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import controle.Comando;
import controle.ListaEventos;
import eventos.Evento;

public class PesquisarEventoNome implements Comando {
	ArrayList<Evento> listaEventos = ListaEventos.getInstance().getListaEventos();

	public PesquisarEventoNome() {

	}

	public void pesquisarEventoNome() {
		String nomeEvento = JOptionPane.showInputDialog("Informe o nome do evento:");
		boolean flag = false;

		if (listaEventos.isEmpty())
			JOptionPane.showMessageDialog(null, "Não há eventos com este nome!");
		else {
			for (Evento evento : listaEventos) {
				if (evento.getNome().equals(nomeEvento)) {
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
		pesquisarEventoNome();
	}
}
