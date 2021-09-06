package examen.sel.pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BusquedaImgPage extends Base {

	private WebDriver driver;

	// CONSTRUCTOR
	public BusquedaImgPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	// LOCALIZADORES
	By loc_tex = By.xpath("//input[@name='q' and @aria-label='Buscar']");
	By loc_btn = By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]");
	By loc_btnimgg = By.linkText("Imágenes");
	By loc_img1 = By.xpath("//img[@jsname='Q4LuWd' and @alt='Hola mundo - Wikipedia, la enciclopedia libre']");
	By loc_txtImgVis = By.xpath("//div[ @class='eYbsle' and text()='Hola mundo - Wikipedia, la enciclopedia libre']");
	By loc_cerr = By.xpath("//*[@id=\"Sva75c\"]/div/div/div[2]/a");

	// METODO PARA BUSCAR Y COMPROBAR TEXTO
	public boolean compVisVent(String texto) {
		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		type(texto, loc_tex);
		click(loc_btn);
		click(loc_btnimgg);
		click(loc_img1);
		if (getText(loc_txtImgVis).equals("Hola mundo - Wikipedia, la enciclopedia libre")) {
			return true;
		} else {
			return false;
		}
	}

	// METODO PARA COMPROBAR CIERRE DE VISUALIZACION
	public boolean compVisCerr() {
		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		click(loc_cerr);
		System.out.println("clic cerrar");
		if (isDisplayed(loc_txtImgVis) != true) {
			System.out.println("paso true");
			return true;
		} else {
			System.out.println("paso false");
			return false;
		}

	}
}
