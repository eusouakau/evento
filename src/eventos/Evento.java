package eventos;

import util.Situacao;
import util.Validador;
import java.util.ArrayList;
import pessoas.Participante;

public class Evento implements Validador {

	private String nome;
	private double taxaInscricao;
	private String data;
	private Local local;
	private ArrayList<Participante> participantes;
	private Situacao situacao;

	public Evento() {

	}

	public Evento(String nome, double taxaInscricao, String data, Local local, ArrayList<Participante> participantes,
			Situacao situacao) {
		this.nome = nome;
		this.taxaInscricao = taxaInscricao;
		this.data = data;
		this.local = local;
		this.participantes = participantes;
		this.situacao = situacao;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getTaxaInscricao() {
		return taxaInscricao;
	}

	public void setTaxaInscricao(double taxaInscricao) {
		this.taxaInscricao = taxaInscricao;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Local getLocal() {
		return local;
	}

	public void setLocal(Local local) {
		this.local = local;
	}

	public ArrayList<Participante> getParticipantes() {
		return participantes;
	}

	public void setParticipantes(ArrayList<Participante> participantes) {
		this.participantes = participantes;
	}

	public Situacao getSituacao() {
		return situacao;
	}

	public void setSituacao(Situacao situacao) {
		this.situacao = situacao;
	}

	@Override
	public boolean validarData() {
		String ano2021 = data.substring(data.length() - 4);
		if (ano2021.equals("2021"))
			return true;
		return false;
	}

	@Override
	public String toString() {
		return "Evento " + nome + "\nTaxa de Inscricao:" + taxaInscricao + "\nData: " + data + "\nLocal:" + local
				+ "\nParticipantes: \n" + participantes + "\nSituação: " + situacao;
	}

}
