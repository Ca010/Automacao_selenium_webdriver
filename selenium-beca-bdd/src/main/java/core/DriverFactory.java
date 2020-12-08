package core;

import java.io.File;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

	public static WebDriver driver;

	public static void iniciarDriver() {
		driver = new ChromeDriver();
	}

	public void acessarUrlGoogle() {
		driver.get("https://www.google.com.br");

	}
	public void acessarUrlEveris() {
		driver.get("https://www.everis.com/brazil/pt-br/home-br");

	}
	public static void fecharDriver() {
		driver.quit();
	}
	public static String dataHoraParaArquivo() {
		Timestamp ts = new Timestamp(System.currentTimeMillis());
		return new SimpleDateFormat("YYYY-MM-DD-HH-ss").format(ts);
	}

	public static void takeSnapShot() throws Exception {
		TakesScreenshot scrShot = ((TakesScreenshot) driver);
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile = new File(
				"C:\\sandbox\\Automacao_selenium_webdriver\\selenium-beca-bdd\\prints\\"
						+ dataHoraParaArquivo() + ".jpg");
		FileUtils.copyFile(SrcFile, DestFile);

	}
}
