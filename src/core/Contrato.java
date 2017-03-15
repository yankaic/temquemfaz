package core;

/**
 *
 * @author yanka
 */
public class Contrato {

	private float valor;

  /**
   *
   */
  public enum Status { 

      /**
       *
       */
      CONCLUIDO, 

      /**
       *
       */
      TRAMITANDO, 

      /**
       *
       */
      CANCELADO, 

      /**
       *
       */
      SOLICITADO, 

      /**
       *
       */
      ESPERANDO_QUALIFICACAO};

	private Status situacao;

	private Pagamento pagamento;

	private Usuario usuario;

	private Anuncio anuncio;

	private Qualificacao qualificacao;

  /**
   *
   * @param anuncio
   * @param cliente
   */
  public Contrato(Anunciante anuncio, Usuario cliente) {

	}

	/**
	 *  
	 */
	public void salvar() {

	}

	/**
	 *  
   * @param pagamento
   * @param pagamento
	 */
	public void definirPagamento(Pagamento pagamento) {

	}

	/**
	 *  
   * @param qualificacao
   * @param qualificacao
	 */
	public void qualificar(Qualificacao qualificacao) {

	}

  /**
   *
   * @param situacao
   */
  public void atualizarStatus(Status situacao) {

	}

	/**
	 *  
   * @param situacao
	 */
	public void notificarContratante(Status situacao) {

	}

}
