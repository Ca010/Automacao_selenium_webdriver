package num_squad_two;

import java.io.File;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrimeiroTeste {

	private static WebDriver driver;

	public static String dataHoraParaArquivo() {
		Timestamp ts = new Timestamp(System.currentTimeMillis());
		return new SimpleDateFormat("YYYY-MM-DD-HH-ss").format(ts);
	}

	public static void takeSnapShot() throws Exception {
		TakesScreenshot scrShot = ((TakesScreenshot) driver);
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile = new File(
				"C:\\Documents\\projetos_beca\\primeira_automacao\\prints\\" + dataHoraParaArquivo() + ".jpg");
		FileUtils.copyFile(SrcFile, DestFile);

	}

	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Documents\\projetos_beca\\primeira_automacao\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.floresonline.com.br");
	}

	@Test
	public void testCadastroEmail() throws Exception {
		driver.findElement(By.ByXPath
				.xpath("//*[@id=\"dynamic_class\"]/div[1]/div/div/div/div/div/div/div[2]/div[7]/div[2]/div[4]/div/a"))
				.click();
		takeSnapShot();
		driver.findElement(By.ByXPath.xpath("//*[@id=\"general-login-ajax-content\"]/div/div[18]/a")).click();
		takeSnapShot();
		driver.findElement(By.id("email_lp")).sendKeys("mila_aandrade@hotmail.com");
		takeSnapShot();
		driver.findElement(By.id("nome_lp")).sendKeys("Camila Alves");
		takeSnapShot();
		driver.findElement(By.id("telefone_lp")).sendKeys("11956238576");
		takeSnapShot();
		driver.findElement(By.id("senha_lp")).sendKeys("teste123");
		takeSnapShot();
		driver.findElement(By.ByXPath.xpath("//*[@id=\"btnMain\"]/span")).click();
		takeSnapShot();
	}

	@After
	public void finish() {
		driver.quit();
	}
}

/*
 * @Test public void testBuscarProduto() {
 * System.setProperty("webdriver.chrome.driver",
 * "C:\\Documents\\projetos_beca\\primeira_automacao\\drivers\\chromedriver.exe"
 * ); WebDriver driver = new ChromeDriver();
 * 
 * driver.get("https://www.floresonline.com.br");
 * driver.findElement(By.id("searchMainInput")).sendKeys("rosas");
 * driver.findElement(By.ById.id("searchMainBtn")).click();
 * driver.findElement(By.ByXPath.xpath(
 * "//*[@id=\"cards_main\"]/div[4]/div/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/i"
 * )).click(); driver.findElement(By.ByXPath.xpath(
 * "//*[@id=\"forbidden-parte-4\"]/a/div/div/div[1]")).sendKeys("02035020");
 * driver.findElement(By.id("selectlink_forbidden0")).click(); }
 */