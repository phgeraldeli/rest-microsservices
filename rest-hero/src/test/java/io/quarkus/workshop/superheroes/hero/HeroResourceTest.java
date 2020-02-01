package io.quarkus.workshop.superheroes.hero;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class HeroResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/api/heroes")
          .then()
             .statusCode(200)
             .body(is("hello"));
    }

}