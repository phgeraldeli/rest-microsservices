package io.quarkus.workshop.superheroes.hero.health;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;
import org.eclipse.microprofile.health.Liveness;

import io.quarkus.workshop.superheroes.hero.HeroResource;

@Liveness
@ApplicationScoped
public class PingHeroResourceHealthCheck implements HealthCheck {
	
	@Inject
	HeroResource heroResource;

	@Override
	public HealthCheckResponse call() {
		heroResource.getRandomHero();
		return HealthCheckResponse.named("Ping Hero REST Endpoint").up().build();
	}
}
