package view;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import eventos.Evento;

public class PesquisarEventoNome{

	public static void pesquisar(ArrayList<Evento> listaEventos) {
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

}
