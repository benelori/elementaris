package com.elementaris.core.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.elementaris.core.controller.ControllerConstants;

@Controller
public class AdminController {
	private final static String ADMIN_MAPPING = "/" + ControllerConstants.ADMIN;

	@GetMapping(ADMIN_MAPPING)
	public String admin(@RequestParam(name = "name", required = false, defaultValue = "World") String name,
			Model model) {
		model.addAttribute("name", name);
		return ControllerConstants.ADMIN;
	}

}