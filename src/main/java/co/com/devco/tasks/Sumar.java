package co.com.devco.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static co.com.devco.userinterface.CalculadoraPage.*;

public class Sumar implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        NUMERO_SEIS.click();
        SIGNO_MAS.click();
        NUMERO_OCHO.click();
        SIGNO_IGUAL.click();
    }
}