package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import starter.steps.GooglePage;

public class GoogleStepDefinitions {
    @Steps
    GooglePage googlePage;

    @Given("^me encuentro en la plataforma de google$")
    public void me_encuentro_en_la_plataforma_de_google() {
        googlePage.openApplication();

    }

    @When("^ingreso la palabra \"([^\"]*)\" y le doy en: \"([^\"]*)\"$")
    public void ingreso_la_palabra_dota_y_le_doy_en_buscar(String palabraBuscar, String opcionDeBusqueda) {
        googlePage.textWord(palabraBuscar);
        googlePage.clicEnBuscar(opcionDeBusqueda);

    }
    @Then("^Visualizo los resultados de busqueda.$")
    public void visualizo_los_resultados_de_busqueda() {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("Visualizo la pagina de dota 2: \"([^\"]*)\"$")
    public void visualizoLaPaginaDeDota(String urlEsperada) {
        Assert.assertEquals(urlEsperada,googlePage.obtenerDireccionWeb());
    }
}
