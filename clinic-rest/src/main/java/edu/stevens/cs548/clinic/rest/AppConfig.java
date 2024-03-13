package edu.stevens.cs548.clinic.rest;

import jakarta.ws.rs.ApplicationPath;
import org.glassfish.jersey.gson.JsonGsonFeature;
import org.glassfish.jersey.server.ResourceConfig;


@ApplicationPath("/")
public class AppConfig extends ResourceConfig {

	public AppConfig() {
		packages("edu.stevens.cs548.clinic.rest").register(JsonGsonFeature.class);
	}

}
