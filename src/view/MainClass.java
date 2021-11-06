package view;

import javax.swing.JOptionPane;
import controle.ListaEventos;
import util.Menus;

public class MainClass {

	private static ListaEventos listaEventos;

	public static void main(String[] args) {
		listaEventos = new ListaEventos();

		while (true) {
			switch (opcao()) {
			case CADASTRAR_EVENTO: {
			    CadastrarEvento.cadastrar(listaEventos.getListaEventos());
				break;
			}
			case PESQUISAR_EVENTO_NOME: {
			    PesquisarEventoNome.pesquisar(listaEventos.getListaEventos());
				break;
			}
			case PESQUISAR_EVENTO_INST: {
			    PesquisarEventoInst.pesquisar(listaEventos.getListaEventos());
				break;
			}
			case PESQUISAR_EVENTO_SITU: {
				PesquisarEventoSitu.pesquisar(listaEventos.getListaEventos());
				break;
			}
			case SAIR: {
				System.exit(0);
				break;
			}

			}
		}
	}

	public static Menus opcao() {
		String menu = "";

		menu += ("Escolha uma opção:\n");
		for (Menus value : Menus.values()) {
			menu += value.getDescricao() + "\n";
		}

		return Menus.values()[Integer.parseInt(JOptionPane.showInputDialog(menu)) - 1];
	}

}
