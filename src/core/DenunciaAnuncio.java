package core;

public class DenunciaAnuncio extends Denuncia {

	private Anuncio anuncioDenunciado;

	private Denuncia denuncia;


	/**
	 *  
   * @param descricao
   * @param autorDenuncia
   * @param anuncioDenunciado
	 */
	public DenunciaAnuncio(String descricao, Usuario autorDenuncia, Anuncio anuncioDenunciado) {
      super(descricao, autorDenuncia);
	}

}
