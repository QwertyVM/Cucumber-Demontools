@RadioButton
Feature: Radio Button
  Background:
    Given me encuentro en la plataforma de DemoQA
    And selecciono el modulo: "Elements"
    And elijo la opción: "Radio Button"

  Scenario Outline: Seleccionar Radio Button
    Given Visualizo las opciones
    When selecciono el radio button: "<opcRB>"
    Then Visualizo el mensaje: "<msjEsperado>"

    Examples:
    |opcRB      |msjEsperado                  |
    |Yes        |You have selected Yes        |
    |Impressive |You have selected Impressive |

