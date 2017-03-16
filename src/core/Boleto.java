package core;
 
/**
 * Está classe armazena as informações necessárias para o pagamento de um serviço
 *  no modo de boleto. Além disso permite a geração de segunda vias.
 */
public class Boleto {

	private String numero;

	private Date dataVencimento;

	private Date dataEmissao;

	private float valor;

	private Pagamento pagamento;

  /**
   * Método que salva as informações do boleto no banco de dados
   */
  public void salvar() {

	}

	/**
	 *  Método que gera uma segunda via do boleto
         * @return Boleto
	 */
	public Boleto gerarSegundaVia() {
		return null;
	}

}
