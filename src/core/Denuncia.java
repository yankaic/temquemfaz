package core;

/**
 *
 * @author yanka
 */
public class Denuncia {

  /**
   * Situacoes possiveis para uma denuncia com relação a analise do moderador.
   */
  public enum Status {

    /**
     * Esse status indica que a denuncia foi efetuada, porem ainda nao foi avaliada por um moderador.
     */
    ESPERANDO_AVALIACAO,

    /**
     * Esse status confirma a 
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
