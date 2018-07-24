package com.elementaris.model.technique;

import com.elementaris.model.camp.ElementType;

public class Technique {
	private long id;
	private int baseDamage;
	private String description;
	private String attackDescription;
	private ElementType elementType;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getBaseDamage() {
		return baseDamage;
	}

	public void setBaseDamage(int baseDamage) {
		this.baseDamage = baseDamage;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAttackDescription() {
		return attackDescription;
	}

	public void setAttackDescription(String attackDescription) {
		this.attackDescription = attackDescription;
	}

	public ElementType getElementType() {
		return elementType;
	}

	public void setElementType(ElementType elementType) {
		this.elementType = elementType;
	}

}
