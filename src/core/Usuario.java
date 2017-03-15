package core;

import java.util.Collection;

/**
 *
 * @author yanka
 */
public class Usuario {

	private String nome;

	private String nickname;

	private Date dataNascimento;

	private String senha;

	private char sexo;

	private Date dataCadastro;

	private String telefone;

	private String email;

	private Login login;

	private Collection<Anuncio> anuncio;

	private Collection<Pergunta> pergunta;

	private Collection<Denuncia> denuncia;

	private Collection<Contrato> contrato;

	private Collection<Endereco> endereco;

	private Anunciante anunciante;

	private Collection<Cartao> cartao;


	/**
	 *  
   * @param endereco
   * @param endereco
	 */
	public void adicionarEndereco(Endereco endereco) {

	}

	/**
	 *  
	 */
	public void carregarContratos() {

	}

  /**
   *
   * @param contrato
   */
  public void notificarUsuario(Contrato contrato) {

	}

}
