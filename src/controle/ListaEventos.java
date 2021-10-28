package controle;

import java.util.ArrayList;

import eventos.Evento;

public class ListaEventos {

	private final ArrayList<Evento> listaEventos = new ArrayList<Evento>();
	private static ListaEventos instance = null;

	public ListaEventos() {

		if (instance == null) {
			instance = this;
		} else {
			instance = null;
		}
	}

	public ArrayList<Evento> getListaEventos() {
		return listaEventos;
	}

	public static ListaEventos getInstance() {
		return instance;
	}

}
