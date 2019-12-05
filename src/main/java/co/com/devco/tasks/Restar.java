package co.com.devco.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static co.com.devco.userinterface.CalculadoraPage.*;

public class Restar implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        NUMERO_CUATRO.click();
        SIGNO_MENOS.click();
        NUMERO_DOS.click();
        SIGNO_IGUAL.click();
    }
}