package com.elementaris.model.map;

import java.util.List;

import game.core.model.AbstractPersistentObject;

public class Region extends AbstractPersistentObject {
	private String name;
	private List<Location> locations;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Location> getLocations() {
		return locations;
	}

	public void setLocations(List<Location> locations) {
		this.locations = locations;
	}

}
