package starter.locators;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import starter.utils.Page_utils;

import java.time.Duration;

public class DemoQA_HomeUI extends PageObject {

    Page_utils pageUtils;

    public void selectMod(String modulo) {
        WebElement moduloText = getDriver().findElement(By.xpath("//h5[contains(text(),'"+modulo+"')]"));
        pageUtils.esperarYdarClic(moduloText, Duration.ofSeconds(20));
    }
}
