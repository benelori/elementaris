package com.elementaris.core.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.elementaris.core.controller.ControllerConstants;

@Controller
public class AdminController {
	private static final String VIEW_PREFIX = "admin/";
	private final static String ADMIN_MAPPING = "/" + ControllerConstants.ADMIN;
	private final static String ADMIN_VIEW = VIEW_PREFIX + ControllerConstants.ADMIN;
	private final static String ADMIN_AI_MAPPING = ADMIN_MAPPING + "/" + ControllerConstants.ADMIN_AI;
	private final static String ADMIN_AI_VIEW = VIEW_PREFIX + "/" + ControllerConstants.ADMIN_AI;

	@GetMapping(ADMIN_MAPPING)
	public String adminHomePage(@RequestParam(name = "name", required = false, defaultValue = "World") String name,
			Model model) {
		model.addAttribute("name", name);
		return ADMIN_VIEW;
	}

	@GetMapping(ADMIN_AI_MAPPING)
	public String adminAIHomePage(@RequestParam(name = "name", required = false, defaultValue = "World") String name,
			Model model) {
		model.addAttribute("name", name);
		return ADMIN_AI_VIEW;
	}

}