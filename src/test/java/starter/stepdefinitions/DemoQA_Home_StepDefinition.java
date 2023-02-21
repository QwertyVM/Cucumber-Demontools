package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import starter.steps.DemoQA_ElementsPage;
import starter.steps.DemoQA_HomePage;
import starter.utils.Page_utils;


public class DemoQA_Home_StepDefinition {

    @Steps
    DemoQA_HomePage demoqa_HomePage;

    @Steps
    DemoQA_ElementsPage demoqa_ElementsPage;

    Page_utils page_utils;

    @Given("^me encuentro en la plataforma de DemoQA$")
    public void me_encuentro_en_la_plataforma_de_google() {
        demoqa_HomePage.openApplication();
    }

    @When("^selecciono el modulo: \"([^\"]*)\"$")
    public void seleccionoElModulo(String modulo) {
        demoqa_HomePage.seleccionarmodulo(modulo);
    }

    @Then("^visualizo de forma correcta la pagina: \"([^\"]*)\"$")
    public void visualizoDeFormaCorrectaLaPagina(String urlEsperada) {
        String urlActual = page_utils.obtenerURL();
        Assert.assertEquals(urlEsperada, urlActual);
    }
}
