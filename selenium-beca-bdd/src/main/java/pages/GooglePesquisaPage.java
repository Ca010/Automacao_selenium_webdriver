package pages;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import core.DriverFactory;

public class GooglePesquisaPage extends DriverFactory {

	static String barraDePesquisa = ("q");
	static String linkHomeEveris = "everis Brazil";
	static String linkAboutUs = "about us";
	static String tituloAboutUs = "about us";
	
	public void buscaBarraDePesquisa(String keys) {
		driver.findElement(By.name(barraDePesquisa)).sendKeys(keys);
		
	}
	
	public void validaUrlEveris(){
		String URL = driver.getCurrentUrl();
		Assert.assertEquals(URL, "https://www.everis.com/brazil/pt-br/home-br" );
    }
	
	public void urlEveris(){
		driver.get("https://www.everis.com/brazil/pt-br/home-br");
    }
	
	public void linkHomeEveris() {
	driver.findElement(By.partialLinkText(linkHomeEveris)).click();
	}
	
	public void linkAboutUs() {
		driver.findElement(By.partialLinkText(linkAboutUs)).click();
	}
	
	public void tituloAboutUs() {
		driver.findElement(By.partialLinkText(tituloAboutUs));
	}
	
	public void validaTituloAboutUs() {
		WebElement titulo = driver.findElement(By.cssSelector("#block-system-main h1"));
		assertEquals("about us", titulo.getText());
	}
}
