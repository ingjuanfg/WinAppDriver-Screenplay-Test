package co.com.devco.tasks;

import net.serenitybdd.screenplay.Performable;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Operaciones {

    public static Performable sumarLosNumeros() {
        return instrumented(Sumar.class);
    }

    public static Performable restarLosNumeros(){
        return instrumented(Restar.class);
    }
}
