package com.elementaris.core.model.event;

import java.util.List;

import game.core.model.inventory.Item;

public class Reward {
	private int experience;
	private int coins;
	private List<Item> items;

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public int getCoins() {
		return coins;
	}

	public void setCoins(int coins) {
		this.coins = coins;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

}
