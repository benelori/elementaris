package game.core.model.inventory;

import java.util.List;

import game.core.model.AbstractPersistentObject;

public class Inventory extends AbstractPersistentObject {
	private List<Item> items;

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

}
