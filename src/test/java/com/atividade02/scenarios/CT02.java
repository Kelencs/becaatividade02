package com.atividade02.scenarios;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.atividade02.core.Driver;
import com.atividade02.pages.FormularioPage;
import com.atividade02.pages.InicioPage;
import com.atividade02.pages.VoosPage;

public class CT02 {
	
	/*
	 *  Acessar o site: https://blazedemo.com/
 Em select “Choose your departure city:” selecionar “San Diego”.
 Em select “Choose your destination city:” selecionar “New York”.
 Clicar em “Find Flights”.
 Escolher a primeira viagem, ou seja clicar no primeiro botão “Choose This Flight”
 Preencher todos os campos do formulário
 Enviar (Purchase Flight) o formulário
 Validar mensagem de sucesso
	 */
	WebDriver driver;
	InicioPage inicioPage;
	VoosPage voosPage;
	FormularioPage formularioPage;
	
	@Before
	public void before() {
		driver = new Driver().getDriver();
		//acessar o site
		Driver.acessarURL(driver, " https://blazedemo.com/");
		inicioPage = new InicioPage(driver);
		voosPage = new VoosPage(driver);
		formularioPage = new FormularioPage(driver);
	}
	@Test
	public void test() {
		
		//selecionar o destino
		inicioPage.selecionarTipoDeViajem();
		
		//clicar no primeiro botão
		voosPage.chooseThis();
		
		//preencher o formulario
		formularioPage.preencherFormulario();
		//validar mensagem de sucesso
		formularioPage.validarFormularioMensagemSucesso();
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




