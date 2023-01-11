package com.nttdata.petstore;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class CrearOrderStepsDefs {

    @Steps
    CrearOrder crearOrder;

    @When("creo el order con petId {int}")
    public void crearOrder(int petId ) {
        crearOrder.crearOrder(petId);
    }
    @Then("el código de respuesta es {int}")
    public void elCódigoDeRespuestaEs(int statusCode) {
        restAssuredThat(response -> response.statusCode(statusCode));
    }

    @And("existe body en el response {string}")
    public void existeBodyEnElResponse(String complete) {
        restAssuredThat(response -> response.body("'status'", equalTo(complete)));
        System.out.println("Status: " + SerenityRest.lastResponse().body().path("status").toString());
        System.out.println(SerenityRest.lastResponse().print());
    }
}
