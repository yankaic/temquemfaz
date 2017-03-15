package core;

/**
 *
 * @author yanka
 */
public class Denuncia {

  /**
   *
   */
  public enum Status {

    /**
     *
     */
    ESPERANDO_AVALIACAO,

    /**
     *
     */
    DENUNCIA_APROVADA,

    /**
     *
     */
    DENUNCIA_REPROVADA
  };

  private String descricao;

  private Date data;

  private Usuario autorDenuncia;

  private String respostaModerador;

  private Status situacao;

  private DenunciaAnuncio denunciaAnuncio;

  private Usuario Autor;

  private Moderador moderador;

  /**
   *
   * @param descricao
   * @param descricao
   * @param autorDenuncia
   * @param autorDenuncia
   */
  public Denuncia(String descricao, Usuario autorDenuncia) {

  }

  /**
   *
   * @param resposta
   */
  public void responder(String resposta) {

  }

  /**
   *
   * @param situacao
   */
  public void atualizarStatus(Status situacao) {

  }

}
