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
  //Método construtor da classe. Cria um contrato entre um usuário e um anúncio.
  public Contrato(Anunciante anuncio, Usuario cliente) {

	}

	/**
	 *  
	 */
	// Método que salva o contrato no banco de dados
	public void salvar() {

	}

	/**
	 *  
   * @param pagamento
   * @param pagamento
	 */
	// Modifica o método que pagamento do contrato
	public void definirPagamento(Pagamento pagamento) {

	}

	/**
	 *  
   * @param qualificacao
   * @param qualificacao
	 */
	// Método que qualifica um contrato de acordo com o serviço recebido
	public void qualificar(Qualificacao qualificacao) {

	}

  /**
   *
   * @param situacao
   */
  // Método que atualiza status do contrato de acordo com o serviço prestado	
  public void atualizarStatus(Status situacao) {

	}

	/**
	 *  
   * @param situacao
	 */
	// Método que notifica contratante sobre o status do serviço
	public void notificarContratante(Status situacao) {

	}

}
