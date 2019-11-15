#Author: Camilo Carvajal
#Feature: Para el inicio de sesion aplicacion ColorLib

@tag
Feature: inicio de sesion aplicacion ColorLib
  I want to use this template for my feature file

  @tag1
  Scenario: inicio de sesion aplicacion ColorLib
    Given Ingreso a navegador
    When Ingresar usuario "demo"
    And Ingresar contraseña "demo"
    And click en boton ingresar
    Then Se valida ingreso correcto

