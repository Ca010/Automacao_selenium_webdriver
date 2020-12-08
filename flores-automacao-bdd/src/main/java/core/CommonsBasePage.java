package core;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class CommonsBasePage extends DriverFactory{
     WebDriverWait wait;

    public CommonsBasePage(){
       wait =  new WebDriverWait(pegaDriver(), 15);
    }

    public void clicarElemento(By by) {
        wait.until(ExpectedConditions.elementToBeClickable(by)).click();
    }

    public void enviarTextoElemento(By by, String texto) {
        wait.until(ExpectedConditions.elementToBeClickable(by)).sendKeys(texto);
    }

    public WebElement encontrarElemento(By by){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public List<WebElement> encontrarElementos(By by){
       return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
    }

    public void validaCondicaoVerdadeira(String mensagemFalha, Boolean condicao){
        Assert.assertTrue(mensagemFalha, condicao);
    }
}
