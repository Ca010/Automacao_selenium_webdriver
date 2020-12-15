package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverFactory {

    static WebDriver driver;

    // configurar(Ex: tamanho tela) o chromedriver no chromeOptions (pesquisar
    // 'chromeOptions list')
    public ChromeOptions configuraChromeOptions() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--window-size=1200,900");
        // o workaround config o Chrome driver para permitir a automacao,quando ha
        // blockers na interacao com os elementos
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        options.addArguments("--disable-infobars");
//        options.addArguments("--disable-gpu");
//        options.setExperimentalOption("useAutomationExtension", false);

//        options.addArguments("--test-type");
        options.addArguments("--incognito");
//        options.addArguments("--verbose");
        return options;
    }

    public void instanciaDriver() {

        driver = new ChromeDriver(configuraChromeOptions());
    }

    public WebDriver pegaDriver() {

        return driver;
    }

    public void limparCookies() {
        driver.manage().deleteAllCookies();

    }
}
