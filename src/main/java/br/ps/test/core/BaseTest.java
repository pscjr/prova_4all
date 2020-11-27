package br.ps.test.core;

import static br.ps.test.core.DriverFactory.getDriver;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class BaseTest {
	
 @Rule
 public TestName testname = new TestName();
	
	@After
	public void finaliza() throws IOException{
		
		TakesScreenshot ss = (TakesScreenshot) getDriver();
		File arquivo = ss.getScreenshotAs(OutputType.FILE);
		//Caso necessario,ajustar para outro diretorio
		FileUtils.copyFile(arquivo, new File ("target/screeshot/"+testname.getMethodName()+ "Screeshot.jpg"));
		if (Propriedades.FECHAR_BROWSER) {
		DriverFactory.killDriver();
	}
	
	}



}
