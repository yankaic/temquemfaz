package core;

/**
 * Classe que representa uma denuncia sobre um usuário
 */
public class DenunciaUsuario extends Denuncia {

	private Usuario usuarioDenunciado;

	private Usuario usuario;

	/**
	 *  Construtor da classe DenunciaUsuario
         * @param usuario : Usuario
         * @param autor : Usuario
         * @param descricao : String
	 */
	public DenunciaUsuario(Usuario usuario, Usuario autor, String descricao) {
      super(descricao, autor);
	}

}
