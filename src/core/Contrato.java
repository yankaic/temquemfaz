package core;

public class Contrato {

	private float valor;

  /**
   *
   */
  public enum Status {CONCLUIDO, TRAMITANDO, CANCELADO, SOLICITADO, ESPERANDO_QUALIFICACAO};

	private Status situacao;

	private Pagamento pagamento;

	private Usuario usuario;

	private Anuncio anuncio;

	private Qualificacao qualificacao;

	public Contrato(Anunciante anuncio, Usuario cliente) {

	}

	/**
	 *  
	 */
	public void salvar() {

	}

	/**
	 *  
	 */
	public void definirPagamento(Pagamento pagamento) {

	}

	/**
	 *  
	 */
	public void qualificar(Qualificacao qualificacao) {

	}

	public void atualizarStatus(Status situacao) {

	}

	/**
	 *  
	 */
	public void notificarContratante(Status situacao) {

	}

}
