package com.elementaris.core.model.builder;

import com.elementaris.core.helper.Builder;
import com.elementaris.core.model.character.MainStats;

public class MainStatsBuilder implements Builder<MainStats> {
	private int health;
	private int stamina;
	private int magic;
	private int armor;

	public MainStatsBuilder setHealth(int health) {
		this.health = health;
		return this;
	}

	public MainStatsBuilder setStamina(int stamina) {
		this.stamina = stamina;
		return this;
	}

	public MainStatsBuilder setMagic(int magic) {
		this.magic = magic;
		return this;
	}

	public MainStatsBuilder setArmor(int armor) {
		this.armor = armor;
		return this;
	}

	public MainStats build() {
		MainStats mainStats = new MainStats();
		mainStats.setHealth(health);
		mainStats.setStamina(stamina);
		mainStats.setMagic(magic);
		mainStats.setArmor(armor);
		return mainStats;
	}

}
