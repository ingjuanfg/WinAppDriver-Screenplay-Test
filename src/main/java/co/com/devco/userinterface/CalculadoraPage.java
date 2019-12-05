package co.com.devco.userinterface;

import io.appium.java_client.windows.WindowsDriver;
import org.openqa.selenium.WebElement;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getProxiedDriver;

public class CalculadoraPage{
    private static WindowsDriver CalculatorSession = getProxiedDriver();

    public static final WebElement NUMERO_UNO = CalculatorSession.findElementByName("Uno");
    public static final WebElement NUMERO_DOS = CalculatorSession.findElementByName("Dos");
    public static final WebElement NUMERO_TRES = CalculatorSession.findElementByName("Tres");
    public static final WebElement NUMERO_CUATRO = CalculatorSession.findElementByName("Cuatro");
    public static final WebElement NUMERO_CINCO = CalculatorSession.findElementByName("Cinco");
    public static final WebElement NUMERO_SEIS = CalculatorSession.findElementByName("Seis");
    public static final WebElement NUMERO_SIETE = CalculatorSession.findElementByName("Siete");
    public static final WebElement NUMERO_OCHO = CalculatorSession.findElementByName("Ocho");
    public static final WebElement NUMERO_NUEVE = CalculatorSession.findElementByName("Nueve");
    public static final WebElement NUMERO_CERO = CalculatorSession.findElementByName("Cero");
    public static final WebElement SIGNO_MAS = CalculatorSession.findElementByName("Más");
    public static final WebElement SIGNO_MENOS = CalculatorSession.findElementByName("Menos");
    public static final WebElement SIGNO_IGUAL = CalculatorSession.findElementByName("Es igual a");
}