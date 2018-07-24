package com.elementaris.model.camp;

import com.elementaris.model.map.Location;

public class Camp {
	private long id;
	private Location location;
	private ElementType elementType;

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

	public ElementType getElementType() {
		return elementType;
	}

	public void setElementType(ElementType elementType) {
		this.elementType = elementType;
	}

}
