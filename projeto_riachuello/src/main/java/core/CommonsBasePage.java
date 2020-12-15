package core;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonsBasePage extends DriverFactory {
	   WebDriverWait wait;

	 public CommonsBasePage(){
	        wait =  new WebDriverWait(pegaDriver(), 50);
	    }

	    public void clicarElemento(By by) {
			wait.until(ExpectedConditions.elementToBeClickable(by)).click();
	    }

	    public void clicarElementoSubmit(By by) {
	        wait.until(ExpectedConditions.elementToBeClickable(by)).sendKeys(Keys.ENTER);
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
	    
	    public void hover(By by) {
	        Actions action = new Actions(driver);
	        WebElement we = driver.findElement(By.xpath("//*[@id=\"store.menu\"]/nav/ul/li[4]/a"));
	        action.moveToElement(we).moveToElement(driver.findElement(By.xpath("//*[@id=\"store.menu\"]/nav/ul/li[4]/a"))).click().build().perform();
	    }
}
