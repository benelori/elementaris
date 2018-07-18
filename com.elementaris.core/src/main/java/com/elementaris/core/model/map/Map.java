package com.elementaris.core.model.map;

import java.util.List;

import game.core.model.AbstractPersistentObject;

public class Map extends AbstractPersistentObject {
	List<Location> locations;

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
