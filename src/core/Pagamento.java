package core;

/**
 *
 * @author yanka
 */
public class Pagamento {

	public enum Tipo {DINHEIRO, CARTAO_DEBITO, CARTAO_CREDITO};

	private Date dataConfirmacao;

	private float valor;

	private Tipo modoDePagamento;

	private Contrato contrato;

	private Cartao cartao;

	private Boleto boleto;

  /**
   *
   * @return
    // Método que verifica se o pagamento já foi confirmado de acordo com a data de confirmação.
   */
    public boolean confirmado() {
	return false;
	}

}
