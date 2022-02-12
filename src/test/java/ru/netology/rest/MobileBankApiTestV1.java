package ru.netology.rest;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.Matchers.equalTo;

class MobileBankApiTestV1 {
    @Test
    void shouldReturnDemoAccounts() {
        // Given - When - Then
        // Предусловия
        given()
//                .baseUri("http://localhost:9999/api/v1")
                .baseUri("https://postman-echo.com")
                .contentType("text/plain; charset=UTF-8")
                .body("{\"id\":4,\"name\":\"Текущий счет\",\"number\":\"1111111112\",\"balance\":0,\"currency\":\"USD\"}")
                // Выполняемые действия
                .when()
//                .post("/demo/accounts")
                .post("/post")
                // Проверки
                .then()
                .statusCode(200)
                .body("name", equalTo("Текущий счет"));

    }
}
