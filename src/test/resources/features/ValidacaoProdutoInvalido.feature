#language:pt
#Author:laedyceci@gmail.com
Funcionalidade: Pesquisa e Validacao de Produto

  Esquema do Cenário: Pesquisa por produto não encontrado
    Dado que o usuário esteja no <Portal> para compras
    Então ele irá realizar uma busca pelo <Produto>
    E o Sistema retorna uma <Mensagem>

    Exemplos: 
      | Portal                        | Produto    | Mensagem |
      | http://www.americanas.com.br/ | MOUSEROBOT | Ops!     |
