package core;

/**
 * Classe que abstrai a denúncia sobre um anuncio. 
 */
public class DenunciaAnuncio extends Denuncia {

	private Anuncio anuncioDenunciado;

	private Denuncia denuncia;


	/**
	 *  Método construtor de uma denúncia referente a um anúncio.
         * @param descricao
         * @param autorDenuncia
         * @param anuncioDenunciado
	 */
	
	public DenunciaAnuncio(String descricao, Usuario autorDenuncia, Anuncio anuncioDenunciado) {
      super(descricao, autorDenuncia);
	}

}
