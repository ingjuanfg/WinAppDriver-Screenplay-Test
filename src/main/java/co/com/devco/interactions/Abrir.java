package co.com.devco.interactions;

import io.appium.java_client.windows.WindowsDriver;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Abrir implements Interaction {
    private static WindowsDriver CalculatorSession = null;
    private static WebElement CalculatorResult = null;

    public static Performable calculadoraWindows() {
        return instrumented(Abrir.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("app", "Microsoft.WindowsCalculator_8wekyb3d8bbwe!App");
        try {
            CalculatorSession = new WindowsDriver(new URL("http://127.0.0.1:4723"), capabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        CalculatorSession.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        CalculatorResult = CalculatorSession.findElementByAccessibilityId("CalculatorResults");
        Assert.assertNotNull(CalculatorResult);
    }
}
