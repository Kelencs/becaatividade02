package com.atividade02.pages;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.atividade02.uimaps.VoosMap;

public class VoosPage {
WebDriver driver;
	
	
	public VoosPage(WebDriver driver) {
		this.driver = driver;
	}
	VoosMap voosMap = new VoosMap(driver);
	public void  validarMensagemSucesso() {
		WebDriverWait wait = new WebDriverWait(driver,10);
		try {
			String textoElement = driver.findElement(By.xpath("//th[text()='Departs: San Diego']")).getText();
	        assertEquals("Departs: San Diego", textoElement);
			
			System.out.println("Sucesso");
		}catch (Exception e) {
			System.out.println("Falha!");
		}
	}
	
	public void chooseThis() {
		voosMap.btnChooseThis.click(driver);

}
}