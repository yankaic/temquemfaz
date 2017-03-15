package core;

import java.util.Collection;

/**
 *
 * @author yanka
 */
public class Anuncio {

	private String descricao;

	private float valor;

	private String categoria;

	private Usuario usuario;

	private Collection<Pergunta> pergunta;

	private Collection<DenunciaAnuncio> denunciaAnuncio;

	private Collection<Contrato> contrato;

	private Anunciante anunciante;

  /**
   *
   * @return
   */
  public int verQualificacao() {
		return 0;
	}

	/**
	 *  
   * @param contrato
   * @param contrato
   * @return 
   * @return  
	 */
	public boolean notificarContrato(Contrato contrato) {
		return false;
	}

}
