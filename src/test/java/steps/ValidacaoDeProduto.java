package steps;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.pt.Então;
import page.object.ValidacaoDeProdutoPageObject;
import utils.GeradorDriver;

public class ValidacaoDeProduto extends GeradorDriver{
	
	ValidacaoDeProdutoPageObject usuario = PageFactory.initElements(getDriver(), ValidacaoDeProdutoPageObject.class);
	
	@Então("^verifica a lista de produtos retornado pelo sistema$")
	public void verifica_a_lista_de_produtos_retornado_pelo_sistema() {
		
		usuario.verificaQuantidadeProdutos();
	}

	@Então("^o usuário seleciona o item desejado$")
	public void o_usuário_seleciona_o_item_desejado(){
		
		usuario.selecionaItemDesejado();
	}

	@Então("^adiciona ao carrinho de compras$")
	
	public void adiciona_ao_carrinho_de_compras() throws InterruptedException {
		usuario.adicionaProdutoCarrinho();
	}

	@Então("^verifica se o (.*) foi inserido no carrinho$")
	
	public void verifica_se_o_produto_foi_inserido_no_carrinho(String produto){
		usuario.verificaProdutoCarrinho(produto);
		getDriver().close();
	}
	
	

}
