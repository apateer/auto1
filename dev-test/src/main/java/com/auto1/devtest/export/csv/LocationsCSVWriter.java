package com.auto1.devtest.export.csv;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.List;

import com.auto1.devtest.model.Location;

public class LocationsCSVWriter {

	private static final String DEFAULT_CSV_COLUMN_SEPARATOR = ",";

	public static void writerLocations(List<Location> locations, String fileName) throws IOException {
		File tempFile = new File(fileName+".csv");
		FileOutputStream tempFileOutputStream;
		tempFileOutputStream = new FileOutputStream(tempFile);
		BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(tempFileOutputStream);
		OutputStreamWriter writerOutputStream = new OutputStreamWriter(bufferedOutputStream, "UTF-8");

		writerOutputStream.write("_id" + DEFAULT_CSV_COLUMN_SEPARATOR + "name" + DEFAULT_CSV_COLUMN_SEPARATOR + "type" + DEFAULT_CSV_COLUMN_SEPARATOR
				+ "latitude" + DEFAULT_CSV_COLUMN_SEPARATOR + "longitude\n");

		for (Location location : locations) {
			writerOutputStream.write(location.getId() + DEFAULT_CSV_COLUMN_SEPARATOR);
			writerOutputStream.write(location.getName() + DEFAULT_CSV_COLUMN_SEPARATOR);
			writerOutputStream.write(location.getType() + DEFAULT_CSV_COLUMN_SEPARATOR);
			writerOutputStream.write(location.getLocation().getLatitude() + DEFAULT_CSV_COLUMN_SEPARATOR);
			writerOutputStream.write(location.getLocation().getLongitude() + DEFAULT_CSV_COLUMN_SEPARATOR);
			writerOutputStream.write("\n");
		}

		writerOutputStream.close();

	}

}
