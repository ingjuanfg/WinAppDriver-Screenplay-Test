package co.com.devco.stepdefinitions;

import co.com.devco.exceptions.ResultadoNoEsperadoException;
import co.com.devco.questions.Resultado;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static co.com.devco.exceptions.ResultadoNoEsperadoException.MENSAJE_RESULTADO_OPERACION_NO_ESPERADO;
import static co.com.devco.tasks.Operaciones.*;
import static co.com.devco.utils.drivers.DriverManager.abrirCalculadoraWindows;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SumarStepDefinition {

    @Before
    public void prepararEscenario() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que (.*) se encuentra en la calculadora de Windows$")
    public void prepararEscenario(String nombreActor) {
        theActorCalled(nombreActor).can(
                BrowseTheWeb.with(abrirCalculadoraWindows())
        );
    }

    @Cuando("^Juan realiza la suma de 6 y 8$")
    public void juanRealizaLaSumaDe() {
        theActorInTheSpotlight().attemptsTo(
                sumarLosNumeros()
        );
    }

    @Cuando("^Juan realiza la resta de 4 y 2$")
    public void juanRealizaLaRestaDe() {
        theActorInTheSpotlight().attemptsTo(
                restarLosNumeros()
        );
    }

    @Cuando("^Juan realiza la multiplicacion de 3 y 7$")
    public void juanRealizaLaMultiplicacionDe() {
        theActorInTheSpotlight().attemptsTo(
                multiplicarLosNumeros()
        );
    }

    @Cuando("^Juan realiza la division de 10 y 5$")
    public void juanRealizaLaDivisionDe() {
        theActorInTheSpotlight().attemptsTo(
                dividirLosNumeros()
        );
    }

    @Entonces("^el deberia de ver el resultado igual a (.*)$")
    public void elDeberiaDeVerElResultadoIgualA(String resultado) {
        theActorInTheSpotlight().should(seeThat(
                Resultado.esCorrecto(resultado)).orComplainWith(
                ResultadoNoEsperadoException.class, MENSAJE_RESULTADO_OPERACION_NO_ESPERADO)
        );
    }
}