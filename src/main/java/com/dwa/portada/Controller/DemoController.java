package com.dwa.portada.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

	@GetMapping("/demo/")
	public String Portada() {
		return "demo/portada";
	}
}
