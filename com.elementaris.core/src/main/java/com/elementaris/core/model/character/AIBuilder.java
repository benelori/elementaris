package com.elementaris.core.model.character;

import game.core.model.character.MainStats;
import game.core.model.character.SecondaryStats;

public class AIBuilder {
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

	public int getChanceToAppear() {
		return chanceToAppear;
	}

	public void setChanceToAppear(int chanceToAppear) {
		this.chanceToAppear = chanceToAppear;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getStamina() {
		return stamina;
	}

	public void setStamina(int stamina) {
		this.stamina = stamina;
	}

	public int getMagic() {
		return magic;
	}

	public void setMagic(int magic) {
		this.magic = magic;
	}

	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getDexterity() {
		return dexterity;
	}

	public void setDexterity(int dexterity) {
		this.dexterity = dexterity;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public int getConstitution() {
		return constitution;
	}

	public void setConstitution(int constitution) {
		this.constitution = constitution;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AI build() {
		MainStats mainStats = new MainStats();
		mainStats.setHealth(health);
		mainStats.setStamina(stamina);
		mainStats.setMagic(magic);
		mainStats.setArmor(armor);
		SecondaryStats secStats = new SecondaryStats();
		secStats.setConstitution(constitution);
		secStats.setIntelligence(intelligence);
		secStats.setDexterity(dexterity);
		secStats.setStrength(strength);
		AI ai = new AI();
		ai.setName(name);
		ai.setChanceToAppear(chanceToAppear);
		ai.setMainStats(mainStats);
		ai.setSecondaryStats(secStats);
		return ai;
	}

}
