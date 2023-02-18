package starter.locators;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class GooglePageUI extends PageObject {

    public void escribirPalabra(String word){

        $(By.xpath("//input[@name='q']")).sendKeys(word);
    }


    public void clicbuscar(String opcionDeBusqueda) {

        $(By.xpath("//input[@value='"+opcionDeBusqueda+"']")).click();

    }
}
