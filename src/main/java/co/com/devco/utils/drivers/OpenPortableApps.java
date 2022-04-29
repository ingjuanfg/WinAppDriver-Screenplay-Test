package co.com.devco.utils.drivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class OpenPortableApps {

    private static DesktopOptions option = new DesktopOptions();
    private static WiniumDriver driver = null;

    public static WebDriver abrirProgramaContable() throws MalformedURLException {
        try {
            option.setApplicationPath("C:\\Windows\\System32\\calc.exe");
            driver = new WiniumDriver(new URL("http://localhost:9999"), option);
            Thread.sleep(5000);
            driver.findElement(By.name("Uno")).click();
            driver.findElement(By.name("Dos")).click();
        }catch (Exception e) {
            e.printStackTrace();
        }
        return driver;
    }
}
