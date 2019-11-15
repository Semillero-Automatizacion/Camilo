#Author: Camilo Carvajal
#Creacion de formulario

@tag
Feature: Validacion de formulario ColorLib
  #I want to use this template for my feature file


  @tag2
  Scenario Outline: CP_1
    Given Ingreso a navegador
    And Ingresar sesion <usuario> <contraseña>
    When diligencio formulario <requisito1> <selectoruno> <golfuno> <url> <correo> <contrasena> <recontrasena> <minize> <number> <id> <date> <maximo> <datedos>

    Examples: 
      | usuario  | contraseña| requisito1 | selectoruno | golfuno | url | correo | contrasena | recontrasena | minize | number | id | date | maximo | datedos |
      | "demo" 	 | "demo"    | "NNNNN"		  | "Tennis"    | "golf" | "www.facebook.com" | "tcs@gmail.com" | "12345" | "12345" | "1234567" | "1234567" | "192.168.3.45" | "2021-12-01" | "12345" | "2012/8/16" |
      
