package com.elementaris.core.model.builder;

import com.elementaris.core.helper.Builder;

import game.core.model.character.SecondaryStats;

public class SecondaryStatsBuilder implements Builder<SecondaryStats> {
	private int strength;
	private int dexterity;
	private int intelligence;
	private int constitution;

	public SecondaryStatsBuilder setStrength(int strength) {
		this.strength = strength;
		return this;
	}

	public SecondaryStatsBuilder setDexterity(int dexterity) {
		this.dexterity = dexterity;
		return this;
	}

	public SecondaryStatsBuilder setIntelligence(int intelligence) {
		this.intelligence = intelligence;
		return this;
	}

	public SecondaryStatsBuilder setConstitution(int constitution) {
		this.constitution = constitution;
		return this;
	}

	public SecondaryStats build() {
		SecondaryStats secStats = new SecondaryStats();
		secStats.setStrength(strength);
		secStats.setConstitution(constitution);
		secStats.setDexterity(dexterity);
		secStats.setIntelligence(intelligence);
		return secStats;
	}

}
