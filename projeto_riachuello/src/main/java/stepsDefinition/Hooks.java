package stepsDefinition;

import core.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends DriverFactory {

    @Before
    public void iniciarDriver() {
        instanciaDriver();
        pegaDriver().get("https://www.riachuelo.com.br/checkout/");
        limparCookies();

    }
//
//    @After
//    public void limparDriver(){
//        pegaDriver().quit();
//    }

}
