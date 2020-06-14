package com.atividade02.uimaps;

import org.openqa.selenium.WebDriver;

import com.atividade02.core.Element;
import com.atividade02.enums.ByValue;



public class InicioMap {
WebDriver driver;
	
	
	public InicioMap(WebDriver driver) {
		this.driver = driver;
		
	}

	public Element cidadePartida = new Element(driver,ByValue.XPATH, "//select[@name='fromPort']");
	
	public Element clicarCidadePartida(String string) {
		return new Element(driver, ByValue.XPATH, "//option[@value='"+string+"']");
	}
	
	public Element cidadeDestino = new Element (driver, ByValue.XPATH, "//select[@name='toPort']");
	
	public Element clicarCidadeDestino(String string) {
		return new Element(driver, ByValue.XPATH, "//option[@value='"+string+"']");
	}
	public Element btnEncontrarVoos = new Element (driver, ByValue.XPATH, "//input[@type='submit']");

}
