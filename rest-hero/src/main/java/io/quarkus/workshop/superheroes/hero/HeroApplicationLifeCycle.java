package io.quarkus.workshop.superheroes.hero;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;

import org.jboss.logging.Logger;

import io.quarkus.runtime.ShutdownEvent;
import io.quarkus.runtime.StartupEvent;

@ApplicationScoped
public class HeroApplicationLifeCycle {

	private static final Logger LOGGER = Logger.getLogger(HeroApplicationLifeCycle.class);

	void onStart(@Observes StartupEvent ev) {
		LOGGER.info("  _   _                      _    ____ ___ ");
		LOGGER.info(" | | | | ___ _ __ ___       / \\  |  _ \\_ _|");
		LOGGER.info(" | |_| |/ _ \\ '__/ _ \\     / _ \\ | |_) | | ");
		LOGGER.info(" |  _  |  __/ | | (_) |   / ___ \\|  __/| | ");
		LOGGER.info(" |_| |_|\\___|_|  \\___/   /_/   \\_\\_|  |___|");
		LOGGER.info("                         Powered by Quarkus");
	}

	void onStop(@Observes ShutdownEvent ev) {
		LOGGER.info("The application HERO is stopping...");
	}
}
