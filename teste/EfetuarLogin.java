package br.ps.test.teste;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;

import br.ps.test.core.DriverFactory;
import br.ps.test.pages.AcessoPage;
import br.ps.test.pages.MenuPage;






public class EfetuarLogin  {

	private static AcessoPage page = new AcessoPage();
	private static MenuPage menu = new MenuPage();

	@Test

	
	public void TesteLogin() {

		
		//Desafio 1
	    page.acessarTelaInicial();
		menu.clicarmenu();
		menu.clicardoce();
		menu.adicionarBrigadeiro();
		menu.adicionarAlfajor();
		menu.acessarCarrinhoCompra();
		menu.addMaisBrigadeiro();
		menu.finalizarCompra();
		//validando a mensagem
		Assert.assertEquals("Pedido realizado com sucesso!", page.validarPedidoFinalizado());
		menu.fechaPedido();

		
		

	


	}
	
	
	@Test
	
	//Desafio 2
	public void segundoDesafio() {
		
		page.acessarTelaInicial();
		menu.clicarmenu();
		menu.clicarBebidas();
		menu.addCoca();
		menu.addFanta();
		menu.addAgua();
		menu.clicarmenu();
		menu.clicarTodos();
		menu.clicarRisole();
		menu.acessarCarrinhoCompra();
		menu.addMaisRisole();
		menu.rmvMenosRisole();
		Assert.assertEquals("5", page.validaQuantidadeadd());
		menu.finalizarCompra();
		//validando a mensagem
		Assert.assertEquals("Pedido realizado com sucesso!", page.validarPedidoFinalizado());
		menu.fechaPedido();
		
	}
	
	

	
	
	
	
	@AfterClass
	public static void finalizaTudo() {
		
		DriverFactory.killDriver();;
	}

	
}
