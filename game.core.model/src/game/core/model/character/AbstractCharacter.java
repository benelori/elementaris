package game.core.model.character;

import game.core.model.AbstractPersistentObject;

public class AbstractCharacter extends AbstractPersistentObject {
	private MainStats mainStats;
	private SecondaryStats secondaryStats;
	private CharacterType characterType;

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
		return "AbstractCharacter [mainStats=" + mainStats + ", secondaryStats=" + secondaryStats + ", characterType="
				+ characterType + "]";
	}

}
