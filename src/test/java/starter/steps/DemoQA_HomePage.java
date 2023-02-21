package starter.steps;

import net.thucydides.core.annotations.Step;
import starter.locators.DemoQA_HomeUI;
import starter.utils.Page_utils;

public class DemoQA_HomePage {

    DemoQA_HomeUI demoqa_homeUI;

    @Step("Abrir Pagina Demo QA")
    public void openApplication(){
        demoqa_homeUI.open();
    }
    @Step("Seleccionar el Módulo")
    public void seleccionarmodulo(String modulo) {
        demoqa_homeUI.selectMod(modulo);
    }

}
