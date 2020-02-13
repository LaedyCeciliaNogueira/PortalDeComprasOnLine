#language:pt
#Author:laedyceci@gmail.com
Funcionalidade: Pesquisa e Validacao de Produto

  Esquema do Cenário: Pesquisa por produto valido
    Dado que o usuário esteja no <Portal> para compras
    Então ele irá realizar uma busca pelo <Produto>
    E verifica a lista de produtos retornado pelo sistema
    Então o usuário seleciona o item desejado
    E adiciona ao carrinho de compras
    E verifica se o <Produto> foi inserido no carrinho

    Exemplos: 
      | Portal                        | Produto     |
      | http://www.americanas.com.br/ | MacBook air |