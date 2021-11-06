package view;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import eventos.Evento;

public class PesquisarEventoInst {
	

	public static void pesquisar(ArrayList<Evento> listaEventos) {
		String instituicao = JOptionPane.showInputDialog("Informe a institui��o onde ocorrer� o evento:");
		boolean flag = false;

		if (listaEventos.isEmpty())
			JOptionPane.showMessageDialog(null, "N�o h� eventos nesta institui��o!");
		else {
			for (Evento evento : listaEventos) {
				if (evento.getNome().equals(instituicao)) {
					JOptionPane.showMessageDialog(null, "Evento localizado: " + evento.toString());
					flag = true;
				}
			}
			if (!flag)
				JOptionPane.showMessageDialog(null, "Institui��o inexistente!");
		}
	}

}
