package com.myprojectCAMILO2.ejemplo1.steps;

import org.openqa.selenium.By;

import com.myprojectCAMILO2.ejemplo1.definitions.Formulario_definitions;
import com.myprojectCAMILO2.ejemplo1.pageObjects.Login_pageObjects;
import com.myprojectCAMILO2.ejemplo1.pageObjects.formulario_pageObjects;

import net.thucydides.core.annotations.Step;

public class fomulario_steps {
	
	Login_pageObjects login_pageObject;
	formulario_pageObjects formulario;
	@Step
	public void ingresar_sesion(String usuario, String contraseña) {
		
		login_pageObject.ingresar_usuario(usuario);
		login_pageObject.ingresar_contraseña(contraseña);
		login_pageObject.click_en_boton_ingresar();
		
}
	@Step
	public void click_form() {

		formulario.click_form();

	}
	@Step
	public void validation() {

		formulario.validation();
		

	}
	@Step
	public void required(String requisito1) {
		formulario.required(requisito1);
		
	}
	@Step
	public void selector_uno(String selectoruno) {
		formulario.selector_uno(selectoruno);
	
		
	}
	@Step
	public void golf_uno(String golfuno) {
		formulario.golf_uno(golfuno);
	
		
	}
	@Step
	public void url_uno(String url, String correo, String contraseña, String recontraseña, String minize, String number, String id, String date, String maximo, String datedos) throws InterruptedException {
		formulario.url_uno(url, correo, contraseña, recontraseña, minize, number, id, date, maximo, datedos);
	
		
	}
	

}
