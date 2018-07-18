package game.core.model.character;

import game.core.model.AbstractPersistentObject;

public class MainStats extends AbstractPersistentObject {
	private int health;
	private int stamina;
	private int magic;

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

}
