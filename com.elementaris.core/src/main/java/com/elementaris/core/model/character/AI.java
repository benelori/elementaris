package com.elementaris.core.model.character;

import game.core.model.character.AbstractCharacter;

public class AI extends AbstractCharacter {
	private String name;
	private int chanceToAppear;

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

}
