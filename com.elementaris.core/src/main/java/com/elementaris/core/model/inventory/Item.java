package com.elementaris.core.model.inventory;

import game.core.model.AbstractPersistentObject;

public class Item extends AbstractPersistentObject {
	ItemType type;

	public ItemType getType() {
		return type;
	}

	public void setType(ItemType type) {
		this.type = type;
	}

}
