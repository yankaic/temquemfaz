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
   Método que consulta o banco de dados e retorna a qualificação do anúncio
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
   // Método que notifica contrato ao usuário
	 */ 
	public boolean notificarContrato(Contrato contrato) {
		return false;
	}

}
