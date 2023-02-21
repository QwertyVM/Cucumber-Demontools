Feature: Elegir Modulo de Prueba
  #Como Tester
  #Quiero elegir el modulo
  #Para practicar automatización
  @Modulo
  Scenario Outline: Elegir un modulo
    Given me encuentro en la plataforma de DemoQA
    When selecciono el modulo: "<mod>"
    Then visualizo de forma correcta la pagina: "<path>"
    Examples:
    |mod                      |path                             |
    |Elements                 |https://demoqa.com/elements      |
    |Forms                    |https://demoqa.com/forms         |
    |Alerts, Frame & Windows  |https://demoqa.com/alertsWindows |
    |Widgets                  |https://demoqa.com/widgets       |
    |Interactions             |https://demoqa.com/interaction   |
    |Book Store Application   |https://demoqa.com/books         |