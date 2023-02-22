Feature: Text Box
  Background:
    Given me encuentro en la plataforma de DemoQA
    And selecciono el modulo: "Elements"
    And elijo la opción: "Text Box"

  @TextBox
  Scenario: Llenar formulario
    Given Visualizo el formulario
    When Ingreso mi nombre: "Victor Alfonso Monzón Anglas", email: "monzonanglasv@gmail.com", dirección 1: "Calle sipan Mz S4 Lt 14 La Molina" y dirección 2: "Mariano Campos 598"
    Then Visualizo el resumen de los datos
