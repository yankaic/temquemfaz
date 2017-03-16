package core;

import java.util.Collection;
 
/**
 * Está classe é representa um anúncio publicado pelos prestadores de serviço. 
 * Ela possui todos os atributos pertinentes ao anúncio publicado, como, descriçao,
 *  categoria, valor do serviço, o anunciante que está oferecendo-o, além de uma lista 
 *  de perguntas realizadas pelos clientes e outros usuários sobre o serviço prestado. 
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
   * Método que consulta o banco de dados e retorna a qualificação do anúncio
   * @return int
   */ 
  public int verQualificacao() {
		return 0;
  }

   /**
   *  Método que notifica contrato ao usuário
   * @param contrato Contrato
   * @return boolean
   */ 
	public boolean notificarContrato(Contrato contrato) {
		return false;
	}

}
