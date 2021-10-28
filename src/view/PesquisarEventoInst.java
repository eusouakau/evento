package view;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import controle.Comando;
import controle.ListaEventos;
import eventos.Evento;

public class PesquisarEventoInst implements Comando {
	ArrayList<Evento> listaEventos = ListaEventos.getInstance().getListaEventos();

	public PesquisarEventoInst() {
	}

	public void pesquisarEventoInst() {
		String instituicao = JOptionPane.showInputDialog("Informe a instituição onde ocorrerá o evento:");
		boolean flag = false;

		if (listaEventos.isEmpty())
			JOptionPane.showMessageDialog(null, "Não há eventos nesta instituição!");
		else {
			for (Evento evento : listaEventos) {
				if (evento.getNome().equals(instituicao)) {
					JOptionPane.showMessageDialog(null, "Evento localizado: " + evento.toString());
					flag = true;
				}
			}
			if (!flag)
				JOptionPane.showMessageDialog(null, "Instituição inexistente!");
		}
	}

	@Override
	public void executar() {
		pesquisarEventoInst();
	}

}
