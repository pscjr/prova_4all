package br.ps.test.core;

import static br.ps.test.core.DriverFactory.getDriver;

import org.openqa.selenium.By;

public class BasePage {

	

	
	
	public void clicarbotaomenu() {
		
		getDriver().findElement(By.xpath("//img[@class='sc-iAyFgw mBXxg']")).click();;
	}
	
	public void clicaropcaodoces() {
		
		getDriver().findElement(By.xpath("//li[@id='category-1']")).click();
	}
	
   public void clicarOpcaoBebidas() {
		
		getDriver().findElement(By.xpath("//li[@id='category-0']")).click();
	}
	
   public void clicarOpcaoTodos() {
		
		getDriver().findElement(By.id("category-all")).click();
	}
   
	public void adicionarBrigadeiro() {
		getDriver().findElement(By.id("add-product-4-btn")).click();
	}
	
	public void adicionarAlfajor() {
		getDriver().findElement(By.id("add-product-5-btn")).click();
	}
	
	public void acessarCarrinho() {
		
		getDriver().findElement(By.xpath("//button[@id='cart-btn']")).click();
		
	}
	
	public void adicionarMaisBrigadeiro() {
		for(int i = 0; i <= 4; i++){
			
		getDriver().findElement(By.id("add-product-4-qtd")).click();
			
			
		}
		
		
	
	}
	
	public void finalizarCompra() {
		
		getDriver().findElement(By.id("finish-checkout-button")).click();
		
		
	}
	
	public String validarPedidoFinalizado() {

		return getDriver().findElement(By.xpath("//h2[contains(text(),'Pedido realizado com sucesso!')]")).getText();

	}
	
	public void fecharPedido() {
		
		getDriver().findElement(By.xpath("//button[contains(text(),'Fechar')]")).click();
		
	}
	
	
	public void adicionarCoca() {
		getDriver().findElement(By.id("add-product-0-btn")).click();
	}
	
	public void adicionarFanta() {
		getDriver().findElement(By.id("add-product-1-btn")).click();
	}
	public void adicionarAgua() {
		getDriver().findElement(By.id("add-product-2-btn")).click();
	}
	
	public void adicionarRisole() {
		getDriver().findElement(By.id("add-product-3-btn")).click();
	}
	
	
public void adicionarMaisrisole() {
	
	
	for(int i = 0; i <= 9; i++){
		
		getDriver().findElement(By.xpath("//div[@id='add-product-3-qtd']")).click();
		
	}
		
		
		
	}


public void removeMenosrisole() {
	for(int i = 0; i <= 5; i++){
		
		getDriver().findElement(By.xpath("//div[@id='remove-product-3-qtd']")).click();
		
	}
	
}

public String validaQuantidadeadd() {
	

	return getDriver().findElement(By.xpath("//p[@id='product-3-qtd']")).getText();
	
	
	

}
	
	
	
	
	
	
	

}
