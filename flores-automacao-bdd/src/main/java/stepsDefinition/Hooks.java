package stepsDefinition;

import core.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hooks extends DriverFactory {

    @Before
    public void iniciarDriver(){
        instanciaDriver();
        pegaDriver().get("https://www.floresonline.com.br/");
    }

    @After
    public void limparDriver(){
        pegaDriver().quit();
    }
}
