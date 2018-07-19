package com.elementaris.core.controller.admin;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
	public String adminAI(Model model) {
		return ADMIN_AI_VIEW;
	}

	@GetMapping(ADMIN_TECHNIQUE_MAPPING)
	public String adminTechnique(Model model) {
		return ADMIN_TECHNIQUE_VIEW;
	}

	@GetMapping(ADMIN_MAPPING)
	public String admin(Model model) {
		model.addAttribute("selectedViews", Arrays.asList("a", "b"));
		return ADMIN_VIEW;
	}

}