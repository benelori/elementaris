package com.elementaris.core.controller.admin;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.elementaris.core.controller.ControllerConstants;

@Controller
public class AdminController {
	private static final String ADMIN_VIEW_PREFIX = "admin/";
	private final static String ADMIN_MAPPING = "/" + ControllerConstants.ADMIN;
	private final static String ADMIN_VIEW = ADMIN_VIEW_PREFIX + ControllerConstants.ADMIN;
	private final static String ADMIN_AI_MAPPING = ADMIN_MAPPING + "/" + ControllerConstants.ADMIN_AI;
	private final static String ADMIN_AI_VIEW = ADMIN_VIEW_PREFIX + "/" + ControllerConstants.ADMIN_AI;
	private final static String ADMIN_TECHNIQUE_MAPPING = ADMIN_MAPPING + "/" + ControllerConstants.ADMIN_TECHNIQUE;
	private final static String ADMIN_TECHNIQUE_VIEW = ADMIN_VIEW_PREFIX + "/" + ControllerConstants.ADMIN_TECHNIQUE;

	@GetMapping(ADMIN_AI_MAPPING)
	public String adminAIView(Model model) {
		return ADMIN_AI_VIEW;
	}

	@RequestMapping(value = ADMIN_AI_MAPPING, method = RequestMethod.POST)
	public String saveAi(Model model) {
		return ADMIN_AI_VIEW;
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

}