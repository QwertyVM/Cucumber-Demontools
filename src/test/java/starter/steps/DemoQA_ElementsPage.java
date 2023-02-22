package starter.steps;

import net.thucydides.core.annotations.Step;
import starter.locators.DemoQA_ElementsUI;

public class DemoQA_ElementsPage {
    DemoQA_ElementsUI demoQA_elementsUI;
    @Step("Elegir Categoría")
    public void elejirCategoria(String categoria) {
        demoQA_elementsUI.selectCategory(categoria);
    }
    @Step("Ingresar Full Name")
    public void ingresarFullName(String fullName) {
        demoQA_elementsUI.ingresarFullName(fullName);
    }
    @Step("Ingresar Email")
    public void ingresarEmail(String email) {
        demoQA_elementsUI.ingresarEmail(email);
    }
    @Step("Ingresar Current Address")
    public void ingresar_c_Address(String c_address) {
        demoQA_elementsUI.ingresar_C_Address(c_address);
    }
    @Step("Ingresar Permanent Address")
    public void ingresar_p_Address(String p_address) {
        demoQA_elementsUI.ingresar_P_Address(p_address);
    }

    @Step("Seleccionar Radio Button")
    public void seleccionarRB(String opcRb) {
        demoQA_elementsUI.clickRB(opcRb);
    }
    @Step("Obtener Texto de mensaje")
    public String getActualMessage() {
        return demoQA_elementsUI.getActualMessageRB();
    }
}
