package io.quarkus.workshop.superheroes.fight.health;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;
import org.eclipse.microprofile.health.Liveness;

import io.quarkus.workshop.superheroes.fight.FightResource;

@Liveness
@ApplicationScoped
public class PingFightResourceHealthCheck implements HealthCheck {

	@Inject
	FightResource fightResource;

	@Override
	public HealthCheckResponse call() {
		fightResource.getAllFights();
		return HealthCheckResponse.named("Ping Hero REST Endpoint").up().build();
	}
}
