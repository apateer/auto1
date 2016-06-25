package com.auto1.devtest.service;

import java.util.List;

import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.auto1.devtest.misc.jersy.JaxRsClientProvider;
import com.auto1.devtest.model.Location;

public class LocationsServiceClient {

	public static final String POSITION_SUGGESST_API_URL = "http://api.goeuro.com/api/v2/position/suggest/en";

	public static List<Location> getLocationsByCityName(String cityName) {
		List<Location> locations = null;
		WebTarget target = JaxRsClientProvider.getWebTarget(POSITION_SUGGESST_API_URL, cityName);
		Response response = target.request(MediaType.APPLICATION_JSON_TYPE).get();

		if (Response.Status.OK.getStatusCode() == response.getStatus()) {
			locations = response.readEntity(new GenericType<List<Location>>() {
			});
		} else {
			throw new RuntimeException(
					"Failed to retrieve locations for city[" + cityName + "], HTTP request status is " + response.getStatusInfo().getReasonPhrase());
		}
		return locations;
	}

}
