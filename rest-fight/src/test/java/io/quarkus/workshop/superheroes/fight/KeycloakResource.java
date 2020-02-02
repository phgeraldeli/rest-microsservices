package io.quarkus.workshop.superheroes.fight;

import java.util.Collections;
import java.util.Map;

import org.jboss.logging.Logger;

import dasniko.testcontainers.keycloak.KeycloakContainer;
import io.quarkus.test.common.QuarkusTestResourceLifecycleManager;

public class KeycloakResource implements QuarkusTestResourceLifecycleManager {

	private static final KeycloakContainer KEYCLOAK = new KeycloakContainer().withAdminPassword("admin")
			.withAdminUsername("admin");

	private static final Logger LOGGER = Logger.getLogger(KeycloakResource.class);

	@Override
	public Map<String, String> start() {
		KEYCLOAK.start();
		LOGGER.info("Iniciando KEYCLOAK com url " + KEYCLOAK.getAuthServerUrl());
		return Collections.singletonMap("quarkus.oidc.auth-server-url", KEYCLOAK.getAuthServerUrl());
	}

	@Override
	public void stop() {
		KEYCLOAK.stop();
	}

}
