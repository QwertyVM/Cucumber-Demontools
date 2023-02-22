package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.fluentlenium.core.annotation.Page;
import org.junit.Assert;
import starter.steps.DemoQA_ElementsPage;
import starter.steps.DemoQA_HomePage;
import starter.utils.Page_utils;


public class DemoQA_Elements_StepDefinition {

    @Steps
    DemoQA_ElementsPage demoqa_ElementsPage;

    Page_utils pageUtils;

    @Given("^elijo la opción: \"([^\"]*)\"$")
    public void elijo_la_opción(String categoria) {
        demoqa_ElementsPage.elejirCategoria(categoria);
    }

    @Given("Visualizo el formulario")
    public void visualizo_el_formulario() {

    }
    @When("^Ingreso mi nombre: \"([^\"]*)\", email: \"([^\"]*)\", dirección 1: \"([^\"]*)\" y dirección 2: \"([^\"]*)\"$")
    public void ingreso_mi_nombre_email_dirección_y_dirección(String fullName, String email, String c_address, String p_address) {
        demoqa_ElementsPage.ingresarFullName(fullName);
        demoqa_ElementsPage.ingresarEmail(email);
        demoqa_ElementsPage.ingresar_c_Address(c_address);
        demoqa_ElementsPage.ingresar_p_Address(p_address);
        pageUtils.submit();
    }
    @Then("Visualizo el resumen de los datos")
    public void visualizo_el_resumen_de_los_datos() {
    }

    @Given("Visualizo las opciones")
    public void visualizo_las_opciones() {

    }
    @When("^selecciono el radio button: \"([^\"]*)\"$")
    public void selecciono_el_radio_button(String opcRadioButton){
        demoqa_ElementsPage.seleccionarRB(opcRadioButton);
    }
    @Then("^Visualizo el mensaje: \"([^\"]*)\"$")
    public void visualizo_el_mensaje(String expectedMessage) {
        Assert.assertEquals(expectedMessage,demoqa_ElementsPage.getActualMessage());
    }

}
