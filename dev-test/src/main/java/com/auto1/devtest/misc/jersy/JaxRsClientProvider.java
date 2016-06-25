package com.auto1.devtest.misc.jersy;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.jackson.JacksonFeature;

import com.auto1.devtest.misc.jackson.JacksonObjectMapperProvider;

public class JaxRsClientProvider {

	public static Client getRestClient() {
		ClientConfig clientConfig = new ClientConfig();
		clientConfig.register(JacksonFeature.class);
		clientConfig.register(JacksonObjectMapperProvider.class);

		return ClientBuilder.newClient(clientConfig);
	}

	public static WebTarget getWebTarget(String uri, String path) {
		Client client = getRestClient();
		return client.target(uri).path(path);
	}

}
