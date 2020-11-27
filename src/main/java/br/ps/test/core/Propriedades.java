package br.ps.test.core;

public class Propriedades {

	
	//Para Rodar em outro Browser, trocar o comando abaixo para FIREFOX
	public static Browsers browser = Browsers.CHROME;
	//parametro para fechar ou nao fechar Browser
	public static  boolean FECHAR_BROWSER = true;
	

	public enum Browsers {
		CHROME, FIREFOX
	}

}
