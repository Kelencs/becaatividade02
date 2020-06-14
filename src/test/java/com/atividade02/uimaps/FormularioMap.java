package com.atividade02.uimaps;

import org.openqa.selenium.WebDriver;

import com.atividade02.core.Element;
import com.atividade02.enums.ByValue;



public class FormularioMap {
   WebDriver driver;
	
	
	public FormularioMap(WebDriver driver) {
		this.driver = driver;
		
	}
	
	public Element inputName = new Element(driver,ByValue.ID,"inputName");
	public Element inputAdress = new Element(driver,ByValue.ID, "address");
	public Element inputCity = new Element(driver,ByValue.ID, "city");
	public Element inputState = new Element(driver,ByValue.ID, "state");
	public Element inputZipe = new Element(driver,ByValue.ID, "zipCode");
	
	public Element card = new Element(driver,ByValue.XPATH, "//select[@id='cardType']");
	
	public Element clicarCard(String string) {
		return new Element(driver, ByValue.XPATH, "//option[@value='"+string+"']");
	} 
	
	public Element inputCredit = new Element(driver, ByValue.ID, "creditCardNumber");
	
	public Element inputMonth = new Element(driver, ByValue.ID, "creditCardMonth");
	
	public Element inputYear= new Element(driver, ByValue.ID, "creditCardYear");
	
	public Element inputNameCardr= new Element(driver, ByValue.ID, "nameOnCard");
	public Element inputRemenber= new Element(driver, ByValue.ID, "rememberMe");
	public Element btnSubmit= new Element(driver, ByValue.ID, "//input[@type='submit']");

}
