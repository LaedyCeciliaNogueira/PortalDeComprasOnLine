package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Elemento {

	@FindBy(css="#h_search-input") 
	protected WebElement tipoProduto;
	
	@FindBy(css="#h_search-btn")
	protected WebElement botaoBusca;
	
	@FindBy(css ="#content-middle > div:nth-child(6) > div > div > div > div.EmptyPage__Content-sc-1u8xkxt-0.edwRSM.ViewUI-sc-1ijittn-6.iXIDWU > span.TextUI-sc-12tokcy-0.djSxgd > span > span.TextUI-sc-12tokcy-0.goIRTq")
	protected WebElement verificaProduto;

	@FindBy(css="#content-middle > div:nth-child(6) > div > div > div > div.row.product-grid.no-gutters.main-grid > div:nth-child(1) > div > div.RippleContainer-sc-1rpenp9-0.dMCfqq > a > section > div.product-card-photo.Photo-bwhjk3-4.feDKYY.ViewUI-sc-1ijittn-6.iXIDWU > div > div > picture > img")
	protected WebElement itemCompra;
	
	@FindBy(css="#btn-buy > div > span")
	protected WebElement botaoComprar;
	
	@FindBy(css="#btn-continue > div")
	protected WebElement botaoContinuar;
	
	@FindBy(css="#app > section > section > div.basket-couponAndProducts__wrapper > div > div.basket-products > section > ul > li > div.basket-productInfo__wrapper > div.basket-productTitle__wrapper > h2 > a")
	protected WebElement confereProduto;
	
	@FindBy(css="#sort-bar > div > aside > div > div:nth-child(1) > span")
	protected WebElement nProdutos;
	
}
