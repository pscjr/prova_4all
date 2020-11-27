package br.ps.test.pages;

import br.ps.test.core.BasePage;
import br.ps.test.core.DriverFactory;

public class AcessoPage extends BasePage {

	public void acessarTelaInicial() {
       DriverFactory.getDriver().get("https://shopcart-challenge.4all.com/");
	}

	

}


