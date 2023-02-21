package starter.locators;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import starter.utils.Page_utils;

import java.time.Duration;

public class DemoQA_ElementsUI extends PageObject {

    Page_utils pageUtils;

    @FindBy(id = "userName")
    WebElement inputFullName;

    @FindBy(id = "userEmail")
    WebElement inputEmail;

    @FindBy(id = "currentAddress")
    WebElement inputCurrentAddress;
    @FindBy(id = "permanentAddress")
    WebElement inputPermanentAddress;

    public void selectCategory(String categoria) {
        WebElement moduloText = getDriver().findElement(By.xpath("//span[contains(text(),'"+categoria+"')]"));
        pageUtils.esperarYdarClic(moduloText, Duration.ofSeconds(20));
    }
    public void ingresarFullName(String fullName) {
        inputFullName.sendKeys(fullName);
    }

    public void ingresarEmail(String email) {
        inputEmail.sendKeys(email);
    }

    public void ingresar_C_Address(String c_address) {
        inputCurrentAddress.sendKeys(c_address);
    }

    public void ingresar_P_Address(String p_address) {
        inputPermanentAddress.sendKeys(p_address);
    }
}
