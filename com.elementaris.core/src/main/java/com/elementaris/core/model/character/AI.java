package com.elementaris.core.model.character;

public class AI {
	private long id;
	private String name;
	private int chanceToAppear;
	private MainStats mainStats;
	private SecondaryStats secondaryStats;
	private CharacterType characterType;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getChanceToAppear() {
		return chanceToAppear;
	}

	public void setChanceToAppear(int chanceToAppear) {
		this.chanceToAppear = chanceToAppear;
	}

	public MainStats getMainStats() {
		return mainStats;
	}

	public void setMainStats(MainStats mainStats) {
		this.mainStats = mainStats;
	}

	public SecondaryStats getSecondaryStats() {
		return secondaryStats;
	}

	public void setSecondaryStats(SecondaryStats secondaryStats) {
		this.secondaryStats = secondaryStats;
	}

	public CharacterType getCharacterType() {
		return characterType;
	}

	public void setCharacterType(CharacterType characterType) {
		this.characterType = characterType;
	}

	@Override
	public String toString() {
		return "AI [id=" + id + ", name=" + name + ", chanceToAppear=" + chanceToAppear + ", mainStats=" + mainStats
				+ ", secondaryStats=" + secondaryStats + ", characterType=" + characterType + "]";
	}

}
