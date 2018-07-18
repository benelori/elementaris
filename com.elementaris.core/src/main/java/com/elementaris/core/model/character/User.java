package com.elementaris.core.model.character;

import com.elementaris.core.model.camp.CampType;
import com.elementaris.core.model.level.LevelType;
import com.elementaris.core.model.map.Location;

import game.core.model.character.AbstractCharacter;
import game.core.model.inventory.Inventory;

public class User extends AbstractCharacter {
	private String username;
	private String password;
	private Location location;
	private Inventory inventory;
	private LevelType level;
	private long experience;
	private CampType campType;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public CampType getCampType() {
		return campType;
	}

	public void setCampType(CampType campType) {
		this.campType = campType;
	}

}
