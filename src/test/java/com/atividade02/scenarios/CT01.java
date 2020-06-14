package com.atividade02.scenarios;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.atividade02.core.Driver;
import com.atividade02.pages.InicioPage;
import com.atividade02.pages.VoosPage;



public class CT01 {
	
	/* Acessar o site: https://blazedemo.com/
		2 - No select “Choose your departure city:” selecionar “San Diego”.
		3 - No select “Choose your destination city:” selecionar “New York”.
		3 - Clicar em “Find Flights”.
		4 - Validar se no cabeçalho da tabela tem as informações: "Departs: San Diego" e "Arrives: New York"
		*/

	WebDriver driver;
	InicioPage inicioPage;
	VoosPage voosPage;
	
	@Before
	public void before() {
		driver = new Driver().getDriver();
		Driver.acessarURL(driver, " https://blazedemo.com/");
		inicioPage = new InicioPage(driver);
		voosPage = new VoosPage(driver);
	}
	@Test
	public void test() {
		inicioPage.selecionarTipoDeViajem();
		
		voosPage.validarMensagemSucesso();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	@After
	public void after() {
		Driver.quit(driver);
	}

}

