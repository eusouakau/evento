package pessoas;

public class Participante extends Pessoa {

	private String endereco;
	private String telefone;
	private String cpf;
	private String email;

	public Participante() {

	}

	public Participante(String endereco, String telefone, String cpf, String email, String nome) {
<<<<<<< HEAD
		super(nome);
=======
		super.setNome(nome);
>>>>>>> 309816c02c7e946e42f0026ad0f3c7c3054fbabd
		this.endereco = endereco;
		this.telefone = telefone;
		this.cpf = cpf;
		this.email = email;
		
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return  super.toString() + "\nEndereco: " + endereco + "\nTelefone: " + telefone + "\nCPF: " + cpf
				+ "\nEmail: " + email + "\n";
	}

}



