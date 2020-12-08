package pages;

import core.CommonsBasePage;
import org.openqa.selenium.By;

import org.openqa.selenium.interactions.Actions;

public class FloresHomePage extends CommonsBasePage {

    By xpathBotaoEntrar = By.xpath("//a[@title=\\'ENTRE\\']");
    By linkTextBotaoEntrar = By.linkText("Entre");
    By linkMinhaConta = By.linkText("MINHA CONTA");
    By divUsuarioLogado= By.className("customer-logado");
    Actions builder;

      public void clicaBotaoEntrar(){
        //  encontrarElementos(xpathBotaoEntrar).get(2).click();
          clicarElemento(linkTextBotaoEntrar);
      }

      public void validarMenuMinhaConta(){
          builder.moveToElement(encontrarElemento(divUsuarioLogado)).build().perform();
          validaCondicaoVerdadeira("Menu minha conta não apareceu", encontrarElemento(linkMinhaConta).isDisplayed());
      }
}
