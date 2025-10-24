package com.myspringboot;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/software-engineers")
public class SoftwareEngineerController {
	
	@GetMapping
	public List<SoftwareEngineer> getEngineers() {
		return List.of(
				new SoftwareEngineer(
						1,
						"Samm",
						"Python, Java, Spring, Spring boot, SQL"
				),
				new SoftwareEngineer(
						2,
						"Robert",
						"C, HTML, CSS, tailwindcss"
					)
				);
	}
}
