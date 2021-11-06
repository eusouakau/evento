package view;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import eventos.Evento;
import util.Situacao;

public class PesquisarEventoSitu {

	public static void pesquisar(ArrayList<Evento> listaEventos) {
		Situacao situEvento = Situacao.values()[Integer
				.parseInt(JOptionPane.showInputDialog("Informe a situação do evento:")) - 1];
		boolean flag = false;

		if (listaEventos.isEmpty())
			JOptionPane.showMessageDialog(null, "Não há eventos nesta situação!");
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

}
