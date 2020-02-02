package io.quarkus.workshop.superheroes.fight.health;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;
import org.eclipse.microprofile.health.HealthCheckResponseBuilder;
import org.eclipse.microprofile.health.Readiness;

import io.quarkus.workshop.superheroes.fight.Fight;
import io.quarkus.workshop.superheroes.fight.FightService;

@Readiness
@ApplicationScoped
public class DatabaseConnectionHealthCheck implements HealthCheck {

	@Inject
    FightService fightService;
	
	@Override
    public HealthCheckResponse call() {
        HealthCheckResponseBuilder responseBuilder = HealthCheckResponse
            .named("Fight Datasource connection health check");

        try {
            List<Fight> fights = fightService.findAllFights();
            responseBuilder.withData("Number of heroes in the database", fights.size()).up();
        } catch (IllegalStateException e) {
            responseBuilder.down();
        }

        return responseBuilder.build();
    }

}
