package com.elementaris.core.model.camp;

import com.elementaris.core.model.map.Location;

import game.core.model.AbstractPersistentObject;

public class Camp extends AbstractPersistentObject {
	private Location location;
	private CampType campType;

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public CampType getCampType() {
		return campType;
	}

	public void setCampType(CampType campType) {
		this.campType = campType;
	}

}
