package util;

public enum Menus {
	  CADASTRAR_EVENTO(1, "1 - Cadastrar Evento"),
	  PESQUISAR_EVENTO_NOME(2, "2 - Pesquisar Evento por nome"),
	  PESQUISAR_EVENTO_INST(3, "3 - Pesquisar Evento pela instituição"),
	  PESQUISAR_EVENTO_SITU(4, "4 - Pesquisar Evento pela situação"),
	  SAIR(5, "5 - Sair");
		

	  private final int identificador;
	  private final String descricao;

	  Menus(final int identificador, final String descricao) {
	    this.identificador = identificador;
	    this.descricao = descricao;
	  }

	  public int getIdentificador() {
	    return identificador;
	  }

	  public String getDescricao() {
	    return descricao;
	  }
}
