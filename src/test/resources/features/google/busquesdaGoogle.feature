Feature: Realizar una busqueda en google de DOTA 2.
  #HISTORIA DE USUARIO: buscar en google dota 2
  #COMO - Navegador de Internet
  #QUIERO - Buscar informacion de DOTA 2 en google.
  #PARA - poder conocer mas de DOTA 2.

  Scenario: BUSCAR EN GOOGLE - Realizar una busqueda exitosa
    Given me encuentro en la plataforma de google
    When ingreso la palabra "DOTA 2" y le doy en: "Buscar con Google"
    Then Visualizo los resultados de busqueda.

  Scenario: ME SIENTO CON SUERTE - Realizar una busqueda exitosa
    Given me encuentro en la plataforma de google
    When ingreso la palabra "DOTA 2" y le doy en: "Voy a tener suerte"
    Then Visualizo la pagina de dota 2: "https://www.dota2.com/home"
