package core;

/**
 *
 * @author yanka
 */
public class DenunciaAnuncio extends Denuncia {

	private Anuncio anuncioDenunciado;

	private Denuncia denuncia;


	/**
	 *  
   * @param descricao
   * @param autorDenuncia
   * @param anuncioDenunciado
	 */
	// Método construtor de uma denúncia referente a um anúncio.
	public DenunciaAnuncio(String descricao, Usuario autorDenuncia, Anuncio anuncioDenunciado) {
      super(descricao, autorDenuncia);
	}

}
