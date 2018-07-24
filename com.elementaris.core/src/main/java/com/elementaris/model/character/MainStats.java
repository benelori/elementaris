package com.elementaris.model.character;

public class MainStats {
	private int health;
	private int stamina;
	private int magic;
	private int armor;

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

	@Override
	public String toString() {
		return "MainStats [health=" + health + ", stamina=" + stamina + ", magic=" + magic + ", armor=" + armor + "]";
	}

}
