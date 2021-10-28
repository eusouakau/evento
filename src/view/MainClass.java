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
				CadastrarEvento cadastro = new CadastrarEvento();
				cadastro.executar();
				break;
			}
			case PESQUISAR_EVENTO_NOME: {
				PesquisarEventoNome pesquisaNome = new PesquisarEventoNome();
				pesquisaNome.executar();
				break;
			}
			case PESQUISAR_EVENTO_INST: {
				PesquisarEventoInst pesquisaInst = new PesquisarEventoInst();
				pesquisaInst.executar();
				break;
			}
			case PESQUISAR_EVENTO_SITU: {
				PesquisarEventoSitu pesquisaSitu = new PesquisarEventoSitu();
				pesquisaSitu.executar();
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
