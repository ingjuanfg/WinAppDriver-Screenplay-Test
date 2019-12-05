package co.com.devco.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.devco.userinterface.CalculadoraPage.*;

public class Sumar implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(NUMERO_SEIS),
                Click.on(SIGNO_MAS),
                Click.on(NUMERO_OCHO),
                Click.on(SIGNO_IGUAL)
        );
    }
}