package steps;

import org.openqa.selenium.support.PageFactory;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import page.object.PesquisaProdutoPageObject;
import utils.GeradorDriver;

public class PesquisaDeProduto extends GeradorDriver{
	
	PesquisaProdutoPageObject usuario = PageFactory.initElements(getDriver(), PesquisaProdutoPageObject.class);
	
	@Dado("^que o usuário esteja no (.*) para compras$")
	public void queOUsuárioEstejaNoParaCompras(String portal) {
		getDriver().get(portal);
	}

	@Então("^ele irá realizar uma busca pelo (.*)$")
	public void eleIráRealizarUmaBuscaPelo(String produto) {
		
		usuario.buscaProduto(produto);
	}
}
