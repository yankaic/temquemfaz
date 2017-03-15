package core;

import java.util.Collection;

public class Anuncio {

	private String descricao;

	private float valor;

	private String categoria;

	private Usuario usuario;

	private Collection<Pergunta> pergunta;

	private Collection<DenunciaAnuncio> denunciaAnuncio;

	private Collection<Contrato> contrato;

	private Anunciante anunciante;

	public int verQualificacao() {
		return 0;
	}

	/**
	 *  
	 */
	public boolean notificarContrato(Contrato contrato) {
		return false;
	}

}
