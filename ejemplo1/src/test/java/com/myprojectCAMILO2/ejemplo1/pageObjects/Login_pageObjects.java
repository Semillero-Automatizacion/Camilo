package com.myprojectCAMILO2.ejemplo1.pageObjects;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://colorlib.com/polygon/metis/login.html")
public class Login_pageObjects extends PageObject {
	String txt_User = " //input[@placeholder='Username']";
	String txt_Password = "//input[@placeholder='Password']";
	String btn_click = "//button[@class='btn btn-lg btn-primary btn-block']";
	String acess = "//h2[@id='toc']";
	String si = "//ul[@class='nav navbar-nav']//a[contains(text(),'Tables')]";

	public void ingresar_usuario(String usuario) {

		find(By.xpath(txt_User)).sendKeys(usuario);

	}

	public void ingresar_contraseña(String contraseña) {

		find(By.xpath(txt_Password)).sendKeys(contraseña);

	}

	public void click_en_boton_ingresar() {
		find(By.xpath(btn_click)).click();

	}

	public void se_valida_ingreso_correcto() {

		String ultimo = find(By.xpath(acess)).getText();
		assertEquals("TAC", ultimo);
		System.out.println(ultimo);

		if (ultimo.equals("TOC")) {
			find(By.xpath(si)).click();
			System.out.println("*********************");
			System.out.println("*" + "TEST EXITOSO" + "*");
			System.out.println("*********************");

		} else {
			System.out.println("TEST FALLIDO");
		}
	}

}
