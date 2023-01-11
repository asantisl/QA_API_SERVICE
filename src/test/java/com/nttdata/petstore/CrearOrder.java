package com.nttdata.petstore;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class CrearOrder {

    private static String CREATE_ORDER = "https://petstore.swagger.io/v2/store/order";

    @Step("Crear order {0} en PetStore")
    public void crearOrder(int petId ){
        SerenityRest.given()
                .contentType("application/json")
                .body("{\n" +
                        "  \"id\": 9223372036854649000,\n" +
                        "  \"petId\": \""+petId+"\",\n" +
                        "  \"quantity\": 0,\n" +
                        "  \"shipDate\": \"2023-01-11T00:20:33.129+0000\",\n" +
                        "  \"status\": \"placed\",\n" +
                        "  \"complete\": \"true\"\n" +
                        "}")
                .post(CREATE_ORDER);

    }
}
