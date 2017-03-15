package core;

/**
 * Está classe é uma abstação de um contrato realizado entre um usuário qualquer
 *   e um anúncio. 
 */
public class Contrato {

	private float valor;

  /**
   * Enumerador que define os estados possíveis de um contrato, desde seu início ao final. 
   */ 
 
  public enum Status { 

      /**
       * quando o contrato já foi finalizando, isso incluí o pagamente e qualificação
       */
      CONCLUIDO, 

      /**
       * quando o cliente opta por pagamento via a plataforma, todavia, sua realização ainda não foi confirmada;
       */
      TRAMITANDO, 

      /**
       *  quando o contrato foi cancelado, seja por parte do anunciante ou do cliente;
       */
      CANCELADO, 

      /**
       * quando o contrato foi realizado pelo cliente, mas ainda não obteve confirmação do anunciante;
       */
      SOLICITADO, 

      /**
       *quando o serviço contratado foi realizado, mas o cliente ou anunciante ainda não o qualificou. 
       */
      ESPERANDO_QUALIFICACAO};

	private Status situacao;

	private Pagamento pagamento;

	private Usuario usuario;

	private Anuncio anuncio;

	private Qualificacao qualificacao;

  /**
   * Método construtor da classe. Cria um contrato entre um usuário e um anúncio.
   * @param anuncio : Anuncio
   * @param cliente : Usuario
   */
  public Contrato(Anunciante anuncio, Usuario cliente) {

	}

	/**
	 *   Método que salva o contrato no banco de dados
	 */
	
	public void salvar() {

	}

	/**
	 * Modifica o método que pagamento do contrato 
         * @param pagamento : Pagamento
	 */
	public void definirPagamento(Pagamento pagamento) {

	}

	/**
	 *  Método que qualifica um contrato de acordo com o serviço recebido
         * @param qualificacao : Qualificacao
	 */
	 
	public void qualificar(Qualificacao qualificacao) {

	}

  /**
   * Método que atualiza status do contrato de acordo com o serviço prestado	
   * @param situacao : Status
   */
  
  public void atualizarStatus(Status situacao) {

	}

	/**
	 * Método que notifica contratante sobre o status do serviço 
         * @param situacao : Status
	 */
	// 
	public void notificarContratante(Status situacao) {

	}

}
