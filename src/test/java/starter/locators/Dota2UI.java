package starter.locators;

import net.serenitybdd.core.pages.PageObject;

public class Dota2UI extends PageObject {

    public String obtenerURL(){
        return getDriver().getCurrentUrl();
    }

}
