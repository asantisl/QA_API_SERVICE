Feature: Crear order PetStore

  @test-createOrder
  Scenario: Crear order

    When creo el order con petId 0
    Then el código de respuesta es 200
    And existe body en el response "placed"

  @test-getOrder
  Scenario: Obtener order

    When establezco la peticion con id 2
    And envio la peticion GET HTTP
    Then recibo valida HTTP codigo de respuesta 200
