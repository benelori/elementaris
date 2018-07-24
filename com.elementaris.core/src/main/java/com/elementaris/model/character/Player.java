package com.elementaris.model.character;

import com.elementaris.model.camp.ElementType;
import com.elementaris.model.inventory.Inventory;
import com.elementaris.model.level.LevelType;
import com.elementaris.model.map.Location;

public class Player {
	private long id;
	private Location location;
	private Inventory inventory;
	private LevelType level;
	private long experience;
	private ElementType campType;

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

	public Inventory getInventory() {
		return inventory;
	}

	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}

	public LevelType getLevel() {
		return level;
	}

	public void setLevel(LevelType level) {
		this.level = level;
	}

	public long getExperience() {
		return experience;
	}

	public void setExperience(long experience) {
		this.experience = experience;
	}

	public ElementType getCampType() {
		return campType;
	}

	public void setCampType(ElementType campType) {
		this.campType = campType;
	}

}
