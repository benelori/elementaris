package com.elementaris.helper;

import com.elementaris.controller.admin.form.AIForm;
import com.elementaris.model.builder.AIBuilder;
import com.elementaris.model.builder.MainStatsBuilder;
import com.elementaris.model.builder.SecondaryStatsBuilder;
import com.elementaris.model.character.AI;
import com.elementaris.model.character.MainStats;
import com.elementaris.model.character.SecondaryStats;

public final class BuilderHelper {
	public static AI buildAi(AIForm aiForm) {
		AI ai = new AIBuilder().setName(aiForm.getName()).setChanceToAppear(aiForm.getChanceToAppear())
				.setHealth(aiForm.getHealth()).setStamina(aiForm.getStamina()).setMagic(aiForm.getMagic())
				.setArmor(aiForm.getArmor()).setConstitution(aiForm.getConstitution()).setStrength(aiForm.getStrength())
				.setDexterity(aiForm.getDexterity()).setIntelligence(aiForm.getIntelligence()).build();
		return ai;
	}

	public static MainStats buildMainStats(int health, int stamina, int magic, int armor) {
		MainStats mainStats = new MainStatsBuilder().setHealth(health).setStamina(stamina).setMagic(magic)
				.setArmor(armor).build();
		return mainStats;
	}

	public static SecondaryStats buildSecondaryStats(int strength, int intelligence, int dexterity, int constitution) {
		SecondaryStats secStats = new SecondaryStatsBuilder().setConstitution(constitution).setDexterity(dexterity)
				.setIntelligence(intelligence).setStrength(strength).build();
		return secStats;
	}
}