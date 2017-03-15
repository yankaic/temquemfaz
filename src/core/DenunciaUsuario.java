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
	// Método construtor de uma denúncia referente a um usuário.
	public DenunciaUsuario(Usuario usuario, Usuario autor, String descricao) {
      super(descricao, autor);
	}

}
