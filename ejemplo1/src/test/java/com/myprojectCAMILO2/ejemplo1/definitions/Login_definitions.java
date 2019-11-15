package com.myprojectCAMILO2.ejemplo1.definitions;

import com.myprojectCAMILO2.ejemplo1.steps.Login_steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class Login_definitions {
@Steps
Login_steps login_steps;
@Given("^Ingreso a navegador$")
public void ingreso_a_navegador() throws Exception {
	login_steps.ingreso_a_navegador();
    
}

@When("^Ingresar usuario \"([^\"]*)\"$")
public void ingresar_usuario(String usuario) throws Exception {
	login_steps.ingreso_usuario(usuario);
    
}

@When("^Ingresar contraseña \"([^\"]*)\"$")
public void ingresar_contraseña(String contraseña) throws Exception {
	login_steps.ingreso_contraseña(contraseña);
}

@When("^click en boton ingresar$")
public void click_en_boton_ingresar() throws Exception {
	login_steps.click_en_boton_ingresar();
    
}

@Then("^Se valida ingreso correcto$")
public void se_valida_ingreso_correcto() throws Exception {
    login_steps.se_valida_ingreso_correcto();
}

	}


