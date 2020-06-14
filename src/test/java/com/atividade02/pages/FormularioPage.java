package com.atividade02.pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.atividade02.uimaps.FormularioMap;



public class FormularioPage {WebDriver driver;


public FormularioPage(WebDriver driver) {
	this.driver = driver;
}

FormularioMap formularioMap = new FormularioMap(driver);


public void preencherFormulario() {
	formularioMap.inputName.sendkeys(driver, "Kelen");
	formularioMap.inputAdress.sendkeys(driver, "rua Jose vidoto 862 ");
	formularioMap.inputCity.sendkeys(driver, "Uberândia");
	formularioMap.inputState.sendkeys(driver, "Minas Gerais");
	formularioMap.inputZipe.sendkeys(driver, "38412080");
	formularioMap.card.click(driver);
	formularioMap.clicarCard("American Express");
	formularioMap.inputCredit.sendkeys(driver, "2015305024758426");
	formularioMap.inputMonth.sendkeys(driver, "08");
	formularioMap.inputYear.sendkeys(driver, "2017");
	formularioMap.inputNameCardr.sendkeys(driver, "kelen c. s.");
	formularioMap.inputRemenber.click(driver);
	formularioMap.btnSubmit.click(driver);
	
}
public void validarFormularioMensagemSucesso() {
	WebDriverWait wait = new WebDriverWait(driver,10);
	try {
		String textoElement = driver.findElement(By.xpath("//h1[text()='Thank you for your purchase today!']")).getText();
        assertEquals("Thank you for your purchase today!", textoElement);
		
		System.out.println("Sucesso");
	}catch (Exception e) {
		System.out.println("Falha!");
	}
}
}


