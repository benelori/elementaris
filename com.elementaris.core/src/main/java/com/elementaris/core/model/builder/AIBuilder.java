package com.elementaris.core.model.builder;

import com.elementaris.core.helper.Builder;
import com.elementaris.core.helper.BuilderHelper;
import com.elementaris.core.model.character.AI;
import com.elementaris.core.model.character.CharacterType;
import com.elementaris.core.model.character.MainStats;
import com.elementaris.core.model.character.SecondaryStats;

public class AIBuilder implements Builder<AI> {
	private String name;
	private int chanceToAppear;
	private int health;
	private int stamina;
	private int magic;
	private int armor;
	private int strength;
	private int dexterity;
	private int intelligence;
	private int constitution;

	public AIBuilder setName(String name) {
		this.name = name;
		return this;
	}

	public AIBuilder setChanceToAppear(int chanceToAppear) {
		this.chanceToAppear = chanceToAppear;
		return this;
	}

	public AIBuilder setHealth(int health) {
		this.health = health;
		return this;
	}

	public AIBuilder setStamina(int stamina) {
		this.stamina = stamina;
		return this;
	}

	public AIBuilder setMagic(int magic) {
		this.magic = magic;
		return this;
	}

	public AIBuilder setArmor(int armor) {
		this.armor = armor;
		return this;
	}

	public AIBuilder setStrength(int strength) {
		this.strength = strength;
		return this;
	}

	public AIBuilder setDexterity(int dexterity) {
		this.dexterity = dexterity;
		return this;
	}

	public AIBuilder setIntelligence(int intelligence) {
		this.intelligence = intelligence;
		return this;
	}

	public AIBuilder setConstitution(int constitution) {
		this.constitution = constitution;
		return this;
	}

	public AI build() {
		MainStats mainStats = BuilderHelper.buildMainStats(health, stamina, magic, armor);
		SecondaryStats secStats = BuilderHelper.buildSecondaryStats(strength, intelligence, dexterity, constitution);
		AI ai = new AI();
		ai.setName(name);
		ai.setChanceToAppear(chanceToAppear);
		ai.setMainStats(mainStats);
		ai.setSecondaryStats(secStats);
		ai.setCharacterType(CharacterType.AI);
		return ai;
	}

}
