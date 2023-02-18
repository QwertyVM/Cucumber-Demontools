package starter.steps;

import net.thucydides.core.annotations.Step;
import starter.locators.GooglePageUI;
import starter.locators.Dota2UI;


public class GooglePage {

    GooglePageUI googleUI;
    Dota2UI dotaUI;
    @Step
    public void openApplication(){
        googleUI.open();
    }

    @Step
    public void textWord(String word){
        googleUI.escribirPalabra(word);
    }
    @Step
    public void clicEnBuscar(String opcionDeBusqueda) {
        googleUI.clicbuscar(opcionDeBusqueda);
    }
    @Step
    public String obtenerDireccionWeb() {
        return dotaUI.obtenerURL();
    }
}
