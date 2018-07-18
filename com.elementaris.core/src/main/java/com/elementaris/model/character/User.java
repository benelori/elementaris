package com.elementaris.model.character;

import com.elementaris.model.map.Location;

import game.core.model.character.AbstractCharacter;

public class User extends AbstractCharacter {
	private String username;
	private String password;
	private Location location;

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

}
