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
     * Esse status indica que o moderador aceitou a denuncia e ira interromper o anuncio ou usuario denunciado.
     */
    DENUNCIA_APROVADA,

    /**
     * Esse status indica que o moderador recusou a denuncia e mantera ativo o anuncio ou usuario denunciado.
     */
    DENUNCIA_REPROVADA
  };

  private String descricao;//relato do denunciante que propoe a interrupcao de um anuncio ou conta de determinado usuario.

  private Date data;//data da denuncia

  private Usuario autorDenuncia;//aquele que denuncia

  private String respostaModerador;//resposta dada pelo moderador para a denuncia feita.

  private Status situacao;//situacao atual da denuncia

  private Moderador moderador;//usuario responsavel por analisar a denuncia

  /**
   *
   * @param descricao
   * @param autorDenuncia
   */
  // Métdo que descreve denúncia realizada
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
  // Método que altera o Status da denúncia.
  public void atualizarStatus(Status situacao) {

  }

}
