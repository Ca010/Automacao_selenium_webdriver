package core;

import java.io.File;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends DriverFactory {

	@Before
	public void init() {
		iniciarDriver();
	}

	@After
	public void finalizarDriver() {
		fecharDriver();
	}
}
