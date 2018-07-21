package com.elementaris.core.helper;

import com.elementaris.core.controller.admin.form.AIForm;
import com.elementaris.core.model.builder.AIBuilder;
import com.elementaris.core.model.character.AI;

public final class BuilderHelper {
	public static AI buildAiFrom(AIForm aiForm) {
		AI ai = new AIBuilder().setName(aiForm.getName()).setChanceToAppear(aiForm.getChanceToAppear())
				.setHealth(aiForm.getHealth()).setStamina(aiForm.getStamina()).setMagic(aiForm.getMagic())
				.setArmor(aiForm.getArmor()).setConstitution(aiForm.getConstitution()).setStrength(aiForm.getStrength())
				.setDexterity(aiForm.getDexterity()).setIntelligence(aiForm.getIntelligence()).build();
		return ai;
	}
}
