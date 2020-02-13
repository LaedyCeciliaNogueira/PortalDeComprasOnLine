package steps;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.pt.E;
import page.object.PesquisaProdutoPageObject;
import utils.GeradorDriver;

public class ValidacaoDeProdutoNaoEncontrado extends GeradorDriver {

	PesquisaProdutoPageObject usuario = PageFactory.initElements(getDriver(), PesquisaProdutoPageObject.class);
	
	@E("^o Sistema retorna uma (.*)$")
	public void oSistemaRetornaUmaMensagem(String mensagem) {
		
		usuario.verificaProduto(mensagem);
		getDriver().close();

	}
}
