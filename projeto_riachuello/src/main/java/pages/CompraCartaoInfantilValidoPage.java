package pages;

import org.openqa.selenium.By;

import core.CommonsBasePage;

public class CompraCartaoInfantilValidoPage extends CommonsBasePage {

    By irOpcoesInfantil = By.xpath("//*[1][span='Infantil']");
    By opcaoTipoProdutoInfantil = By.cssSelector("#maincontent > div.columns > div > div.category-cms > div > div > div.container.clp-left-right-wrapper > div.col-left-sidebar-clp > div > div:nth-child(3) > ul > li:nth-child(1) > a");
    public void clicarIrOpcaoInfantil() {
        clicarElemento(irOpcoesInfantil);
    }

    public void clicarOpcaoProdutoInfantil(){
        clicarElemento(opcaoTipoProdutoInfantil);
    }
}
