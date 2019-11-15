package com.myprojectCAMILO2.ejemplo1.steps;

import com.myprojectCAMILO2.ejemplo1.pageObjects.Login_pageObjects;

import net.thucydides.core.annotations.Step;

public class Login_steps {
	Login_pageObjects login_pageObject;
    @Step
	public void ingreso_a_navegador() {
	login_pageObject.open();

	}
    @Step
    public void ingreso_usuario(String usuario) {
    	login_pageObject.ingresar_usuario(usuario);

    	}
    @Step
    public void ingreso_contraseña(String contraseña) {
    	login_pageObject.ingresar_contraseña(contraseña);

    	}
    @Step
    public void click_en_boton_ingresar() {
    	login_pageObject.click_en_boton_ingresar();

    	}
    @Step
    public void se_valida_ingreso_correcto() {
    	login_pageObject.se_valida_ingreso_correcto();

    	}
}
