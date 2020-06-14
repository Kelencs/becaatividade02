package com.atividade02.uimaps;

import org.openqa.selenium.WebDriver;

import com.atividade02.core.Element;
import com.atividade02.enums.ByValue;

public class VoosMap {
WebDriver driver;
	
	
	public VoosMap(WebDriver driver) {
		this.driver = driver;
		
	}

	public Element departs = new Element(driver,ByValue.XPATH, "//th[text()='Departs: San Diego']");
	
	public Element Arrives = new Element(driver, ByValue.XPATH, "//th[text()='Arrives: New York']");

	public Element btnChooseThis = new Element(driver, ByValue.XPATH, "//tbody/tr[1]/td[1]/input");
}
