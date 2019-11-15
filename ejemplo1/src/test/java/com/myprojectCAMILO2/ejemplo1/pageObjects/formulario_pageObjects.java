package com.myprojectCAMILO2.ejemplo1.pageObjects;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;

public class formulario_pageObjects extends PageObject{
	
	String form ="//a[@class='dropdown-toggle']";
	String validation ="//ul[@class='dropdown-menu']//a[contains(text(),'Validation')]";
	String requerido ="//input[@id='req']";
	String selector1 = "//select[@id='sport']";
	String golf1 = "//select[@id='sport2']//option[contains(text(),'Golf')]";
	String url1 = "//input[@id='url1']";
	String correouno = "//input[@id='email1']";
	String contraseña1 = "//input[@id='pass1']";
	String recontraseña1 = "//input[@id='pass2']";
	String minize1 = "//input[@id='minsize1']";
	String number1 = "//input[@id='number2']";
	String id1 ="//input[@id='ip']";
	String date1 = "//input[@id='date3']";
	String maximo1 = "//input[@id='maxsize1']";
	String date2= "//input[@id='past']";
	String aser="//div[@class='formErrorContent']";
	String validar1 ="//form[@id='popup-validation']//input[@class='btn btn-primary']";
	public void click_form() {

		find(By.xpath(form)).click();

	}
	public void validation() {

		find(By.xpath(validation)).click();
		
		//find(By.xpath(selector1)).getSelectedVisibleTextValue("Tennis");

	}
	public void required(String requisito1) {
		find(By.xpath(requerido)).sendKeys(requisito1);
	}
	
	public void selector_uno(String selectoruno) {
		find(By.xpath(selector1)).selectByVisibleText(selectoruno);
	
	}
	public void golf_uno(String golfuno) {
		find(By.xpath(golf1)).click();
		
	}
	public void url_uno(String url, String correo, String contraseña, String recontraseña, String minize, String number, String id, String date, String maximo, String datedos) throws InterruptedException {
		find(By.xpath(url1)).sendKeys(url);
		find(By.xpath(correouno)).sendKeys(correo);
		find(By.xpath(contraseña1)).sendKeys(contraseña);
		find(By.xpath(recontraseña1)).clear();
		find(By.xpath(recontraseña1)).sendKeys(recontraseña);
		find(By.xpath(minize1)).sendKeys(minize);
		find(By.xpath(number1)).clear();
		find(By.xpath(number1)).sendKeys(number);
		find(By.xpath(id1)).clear();
		find(By.xpath(id1)).sendKeys(id);
		find(By.xpath(date1)).clear();
		find(By.xpath(date1)).sendKeys(date);
		find(By.xpath(maximo1)).clear();
		find(By.xpath(maximo1)).sendKeys(maximo);
		find(By.xpath(date2)).clear();
		find(By.xpath(date2)).sendKeys(datedos);
		find(By.xpath(validar1)).click();
		Thread.sleep(5000);
		assertEquals(false, find(By.xpath(aser)).isVisible());
		
		Thread.sleep(5000);
	}


}
