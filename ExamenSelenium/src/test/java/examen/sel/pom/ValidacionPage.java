package examen.sel.pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ValidacionPage extends Base {

	private WebDriver driver;

//LOCALIZADORES
	By loc_tex = By.xpath("//input[@name='q' and @aria-label='Buscar']");
	By loc_btn = By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]");
	By loc_p2 = By.xpath("//a[@aria-label='Page 2' and @class='fl']");
	By loc_titComp = By.xpath("//h3");
	String t1;
	String t2;

	// CONSTRUCTOR
	public ValidacionPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	// METODO PARA VALIDAR LA SEGUNDA PAGINA DEL BUSCADOR
	public boolean validarSegPage(String texto) {

		type("selenium", loc_tex);
		click(loc_btn);
		t1 = getText(loc_titComp);
		click(loc_p2);
		t2 = getText(loc_titComp);

		// VALIDACION DEL METODO
		if (t1.equals(t2) != true) {
			return true;
		} else {
			return false;
		}
	}

}
