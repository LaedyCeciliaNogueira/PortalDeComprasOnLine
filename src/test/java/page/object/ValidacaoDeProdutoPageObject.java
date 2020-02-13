package page.object;

import static org.junit.Assert.assertTrue;
import elements.Elemento;

public class ValidacaoDeProdutoPageObject extends Elemento {

	public void verificaQuantidadeProdutos() {
		String[] array = nProdutos.getText().split(" ");
		int valor = Integer.parseInt(array[0].replace(".", ""));
		assertTrue(valor > 0);
	}

	public void selecionaItemDesejado() {

		itemCompra.click();
	}

	public void adicionaProdutoCarrinho() throws InterruptedException  {
		
		Thread.sleep(3000);
		botaoComprar.click();
		
		Thread.sleep(3000);
		botaoContinuar.click();
	}

	public void verificaProdutoCarrinho(String produto) {
		
		confereProduto.getSize();
		String produtoCarrinho = confereProduto.getText();
		assertTrue(produtoCarrinho.toLowerCase().contains(produto.toLowerCase()));
	}
}
