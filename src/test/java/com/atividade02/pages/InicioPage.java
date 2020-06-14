package com.atividade02.pages;

import org.openqa.selenium.WebDriver;

import com.atividade02.uimaps.InicioMap;



public class InicioPage {
	WebDriver driver;
	public InicioPage(WebDriver driver) {
		this.driver = driver;
	}
	InicioMap inicioMap = new InicioMap(driver);
	public void selecionarTipoDeViajem() {
		inicioMap.cidadePartida.click(driver);;
		inicioMap.clicarCidadePartida("San Diego").click(driver);
		inicioMap.cidadeDestino.click(driver);
		inicioMap.clicarCidadeDestino("New York").click(driver);
		inicioMap.btnEncontrarVoos.click(driver);
		
	}
	

}
