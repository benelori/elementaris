package com.elementaris.model.map;

import java.util.List;

public class Map {
	private long id;
	List<Location> locations;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public List<Location> getLocations() {
		return locations;
	}

	public void setLocations(List<Location> locations) {
		this.locations = locations;
	}

	public void addLocation(Location location) {
		locations.add(location);
	}
}
