package core;

public class Pagamento {

	private enum Tipo;

	private Date dataConfirmacao;

	private float valor;

	private Tipo modoDePagamento;

	private Contrato contrato;

	private Cartao cartao;

	private Boleto boleto;

	public boolean confirmado() {
		return false;
	}

}
