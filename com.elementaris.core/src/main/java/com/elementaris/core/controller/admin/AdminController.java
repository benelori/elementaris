package com.elementaris.core.controller.admin;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.elementaris.core.controller.ControllerConstants;
import com.elementaris.core.controller.admin.form.AIForm;
import com.elementaris.core.helper.BuilderHelper;
import com.elementaris.core.model.character.AI;
import com.elementaris.core.model.character.MainStats;
import com.elementaris.core.model.character.SecondaryStats;

@Controller
public class AdminController {
	private static final String ADMIN_VIEW_PREFIX = "admin/";
	private final static String ADMIN_MAPPING = "/" + ControllerConstants.ADMIN;
	private final static String ADMIN_VIEW = ADMIN_VIEW_PREFIX + ControllerConstants.ADMIN;
	private final static String ADMIN_AI_MAPPING = ADMIN_MAPPING + "/" + ControllerConstants.ADMIN_AI;
	private final static String ADMIN_AI_VIEW = ADMIN_VIEW_PREFIX + ControllerConstants.ADMIN_AI;
	private final static String ADMIN_TECHNIQUE_MAPPING = ADMIN_MAPPING + "/" + ControllerConstants.ADMIN_TECHNIQUE;
	private final static String ADMIN_TECHNIQUE_VIEW = ADMIN_VIEW_PREFIX + ControllerConstants.ADMIN_TECHNIQUE;

	@GetMapping(ADMIN_AI_MAPPING)
	public String adminAIView(@ModelAttribute("ai") AIForm aiForm, ModelMap model) {
		List<AI> ais = findAllAis();
		return ADMIN_AI_VIEW;
	}

	@PostMapping(ADMIN_AI_MAPPING)
	public String saveAi(@ModelAttribute("ai") AIForm aiForm, Model model) {
		AI ai = BuilderHelper.buildAi(aiForm);
		System.out.println(ai);
		return "redirect:" + ADMIN_AI_MAPPING;
	}

	@GetMapping(ADMIN_TECHNIQUE_MAPPING)
	public String adminTechniqueView(Model model) {
		return ADMIN_TECHNIQUE_VIEW;
	}

	@GetMapping(ADMIN_MAPPING)
	public String adminView(Model model) {
		model.addAttribute("selectedViews", Arrays.asList("a", "b"));
		return ADMIN_VIEW;
	}

	@ModelAttribute("ais")
	private List<AI> findAllAis() {
		AI ai = new AI();
		ai.setName("namefdsaf");
		ai.setChanceToAppear(50);
		ai.setMainStats(new MainStats());
		ai.setSecondaryStats(new SecondaryStats());
		return Arrays.asList(ai);
	}

}