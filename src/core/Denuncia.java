package core;
 
/**
 * Abstração de uma denúncia. 
 *  Uma denúncia pode ser realizada por qualquer usuário do sistema. E são divididas em dois tipo: 
 *    Denúncia de usuário (classe DenunciaUsuario); ou, denúncia sobre anúncio (classe DenunciaAnuncio).
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
   * Métdo que descreve denúncia realizada
   * @param descricao : String
   * @param autorDenuncia : Usuario
   */
  public Denuncia(String descricao, Usuario autorDenuncia) {

  }

  /**
   * Método responsável por armazenar a resposta de uma denúncia. 
   *   Essa resposta é realizada pelo moderador do sistema
   * @param resposta : String
   */
  public void responder(String resposta) {

  }

  /**
   * Método que altera o Status da denúncia.
   * @param situacao : Status
   */
  public void atualizarStatus(Status situacao) {

  }

}
