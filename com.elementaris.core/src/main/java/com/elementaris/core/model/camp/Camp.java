package com.elementaris.core.model.camp;

import com.elementaris.core.model.map.Location;

public class Camp {
	private long id;
	private Location location;
	private CampType campType;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

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
