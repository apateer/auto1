package com.auto1.devtest;

import java.util.List;

import com.auto1.devtest.export.csv.LocationsCSVWriter;
import com.auto1.devtest.model.Location;
import com.auto1.devtest.service.LocationsServiceClient;

public class GoEuroTest {

	public static void main(String[] args) {

		try {
			String cityName = null;

			if (args.length == 1) {
				cityName = args[0];
			}

			if (cityName == null) {
				throw new IllegalArgumentException("Missing parameter 'CityName'. Application aported.");
			}

			System.out.println("Retrieving locations for city[" + cityName + "]");
			List<Location> locations = LocationsServiceClient.getLocationsByCityName(cityName);
			System.out.println(locations.size() + " Locations retrieved successfully for city[" + cityName + "]");

			if (locations.size() > 0) {
				System.out.println("Exporting locations to a CSV file.");
				LocationsCSVWriter.writerLocations(locations, cityName);
				System.out.println("Locations exported successfully to a CSV file.");
			}
			
		} catch (Exception ex) {
			System.out.println("Unexpected error happend due to, " + ex.getMessage());
			ex.printStackTrace();
		}
	}

}
