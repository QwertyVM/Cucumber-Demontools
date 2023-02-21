package starter.utils;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Page_utils extends PageObject {
    private static String url;

    public void esperarYdarClic(WebElement element, Duration timeout){
        new WebDriverWait(getDriver(),timeout)
                .until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    public String obtenerURL(){
        url = getDriver().getCurrentUrl();
        return url;
    }

    public void submit() {
        WebElement btnSubmit = getDriver().findElement(By.id("submit"));
        btnSubmit.click();
    }
}
