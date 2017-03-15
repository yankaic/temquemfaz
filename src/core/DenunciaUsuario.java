package core;

/**
 *
 * @author yanka
 */
public class DenunciaUsuario extends Denuncia {

	private Usuario usuarioDenunciado;

	private Usuario usuario;

	/**
	 *  
   * @param usuario
   * @param autor
   * @param autor
   * @param descricao
   * @param descricao
	 */
	public DenunciaUsuario(Usuario usuario, Usuario autor, String descricao) {
      super(descricao, autor);
	}

}
