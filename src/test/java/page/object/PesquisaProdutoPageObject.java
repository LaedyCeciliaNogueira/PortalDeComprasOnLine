package page.object;

import org.junit.Assert;

import elements.Elemento;

public class PesquisaProdutoPageObject extends Elemento{

	public void buscaProduto(String produto){
	
		tipoProduto.sendKeys(produto);
		botaoBusca.click();		
	}
	
	public void verificaProduto(String mensagem) {
		
		String msgObtida = verificaProduto.getText();
		String MsgEsperada = mensagem;
		Assert.assertEquals(MsgEsperada.toUpperCase(), msgObtida.toUpperCase());
	}
	
}
