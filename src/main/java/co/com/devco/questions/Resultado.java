package co.com.devco.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.devco.userinterface.CalculadoraPage.RESULTADO;

public class Resultado implements Question<Boolean> {
    private String resultado;

    public Resultado(String resultado){
        this.resultado = resultado;
    }

    public static Resultado esCorrecto(String resultado){
        return new Resultado(resultado);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return RESULTADO.resolveFor(actor).getText().contains(resultado);
    }
}
