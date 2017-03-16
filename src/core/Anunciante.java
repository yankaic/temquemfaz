package core;

import java.util.Collection;
 
/**
 * Esta classe abstrai um usuário do tipo anunciante, que é capaz de criar anúncios
 *   e gerenciá-los. Assim, ela possui uma lista dos anuncios publicados pelo anunciante,
 *   ou prestador de serviço, e um currículo, responsável por apresentar uma breve qualificação
 *   profissional deste. Além disso, o currívulo estará disponível aos clientes, com o intuito de 
 *   disponibilizar mais uma opção para a escolha de seus contratos. 
 */
public class Anunciante extends Usuario {

	private String curriculo;

	private Usuario usuario;

	private Collection<Anuncio> anuncio;

	/**
	 * Método que cria um anúncio, e associa ao anunciante
         * @param anuncio : Anuncio
	 */ 
	public void criarAnuncio(Anuncio anuncio) {

	}

	/**
	 * Método que exclui um anúncio, e associa ao anuciante
         * @param anuncio : Anuncio
	 */
	public void excluirAnuncio(Anuncio anuncio) {

	}

	/**
	 * Método que edita um anúncio, e associa ao anunciante
         * @param anuncio : Anuncio
	 */
	public void editarAnuncio(Anuncio anuncio) {

	}

  /**
   * Método que notifica serviço e associa ao contrato	
   * @param contrato : Contrato
   */
  public void notificarServico(Contrato contrato) {

	}

}
