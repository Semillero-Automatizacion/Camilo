package com.myprojectCAMILO2.ejemplo1.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)

@CucumberOptions(features="src/test/resources/features/formulario.feature", glue= {"com.myprojectCAMILO2.ejemplo1"})


public class RunnerLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
