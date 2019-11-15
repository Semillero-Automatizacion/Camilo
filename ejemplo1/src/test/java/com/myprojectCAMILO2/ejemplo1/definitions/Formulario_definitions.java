package com.myprojectCAMILO2.ejemplo1.definitions;

import com.myprojectCAMILO2.ejemplo1.steps.fomulario_steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class Formulario_definitions {
	@Steps
	fomulario_steps fon_steps;
	
	
	@Given("^Ingresar sesion \"([^\"]*)\" \"([^\"]*)\"$")
	public void ingresar_sesion(String usuario, String contraseña) throws Exception {
	   fon_steps.ingresar_sesion(usuario,contraseña);
	}
	
	@When("^diligencio formulario \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void diligencio_formulario(String requisito1, String selectoruno, String golfuno, String url, String correo, String contraseña, String recontraseña, String minize, String number, String id, String date, String maximo, String datedos) throws Exception {
		fon_steps.click_form();
		fon_steps.validation();
		fon_steps.required(requisito1);
		Thread.sleep(1000);
		fon_steps.selector_uno(selectoruno);
		Thread.sleep(1000);
		fon_steps.golf_uno(golfuno);
		Thread.sleep(1000);
		fon_steps.url_uno(url, correo, contraseña, recontraseña, minize, number, id, date, maximo, datedos);
		Thread.sleep(1000);
		
		
	    
	}


	}

