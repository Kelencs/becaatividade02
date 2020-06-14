package com.atividade02.core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.atividade02.enums.ByValue;



public class Element {
	private WebDriver driver;
	private String value;
	private ByValue byValue;
	
	public Element(WebDriver driver, ByValue byValue, String value) {
		
		this.driver = driver;
		this.byValue = byValue;
		this.value = value;
		
	}
		public WebElement criarElemento(WebDriver driver) {
			try {
				Thread.sleep(1000);
				WebDriverWait wait = new WebDriverWait(driver,10);
				switch(byValue) {
				case XPATH:
				return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(value)));
				case ID:
					return wait.until(ExpectedConditions.presenceOfElementLocated(By.id(value)));
				case CLASS_NAME:
					return wait.until(ExpectedConditions.presenceOfElementLocated(By.className(value)));
				
				default: 
					return null;
				}
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			return null;
		}
	public void click(WebDriver driver) {
		criarElemento(driver).click();
	}
	public void sendkeys(WebDriver driver, String string) {
		criarElemento( driver).sendKeys(string);
	}
	public void select(WebDriver driver, String visibleText) {
		Select select = new Select(criarElemento( driver));
		select.selectByVisibleText(visibleText);
	}
	public String getValue() {
		return this.value;
	}


}
