package com.elementaris.model.character;

public class SecondaryStats {
	private int strength;
	private int dexterity;
	private int intelligence;
	private int constitution;

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

	@Override
	public String toString() {
		return "SecondaryStats [strength=" + strength + ", dexterity=" + dexterity + ", intelligence=" + intelligence
				+ ", constitution=" + constitution + "]";
	}

}
