package co.com.devco.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.devco.userinterface.CalculadoraPage.*;

public class Sumar implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        System.out.println("Llegue");
        actor.attemptsTo(
                Click.on(ARCHIVO),
                Click.on(NUEVO)
            //    Click.on(NUMERO_OCHO),
              //  Click.on(SIGNO_IGUAL)
        );
        System.out.println("Sali");
    }
}