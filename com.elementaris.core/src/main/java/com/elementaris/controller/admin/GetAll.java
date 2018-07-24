package com.elementaris.controller.admin;

import java.util.Arrays;
import java.util.List;

import com.elementaris.model.camp.ElementType;
import com.elementaris.model.character.AI;
import com.elementaris.model.character.MainStats;
import com.elementaris.model.character.SecondaryStats;
import com.elementaris.model.technique.Technique;

public class GetAll {

	public static List<AI> findAllAis() {
		AI ai = new AI();
		ai.setName("AI");
		ai.setChanceToAppear(50);
		ai.setMainStats(new MainStats());
		ai.setSecondaryStats(new SecondaryStats());
		return Arrays.asList(ai);
	}

	public static List<Technique> findAllTechniques() {
		Technique technique = new Technique();
		technique.setName("Tech");
		technique.setBaseDamage(10);
		technique.setElementType(ElementType.FIRE);
		return Arrays.asList(technique);
	}

}
