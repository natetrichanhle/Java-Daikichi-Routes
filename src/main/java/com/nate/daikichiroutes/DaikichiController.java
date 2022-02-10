package com.nate.daikichiroutes;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DaikichiController {
	@RequestMapping("/daikichi")
	public String welcome() {
		return "Welcome";
	}
	@RequestMapping("/daikichi/tomorrow")
	public String tomorrow() {
		return "Tomorrow, an opportunity will arise, so be sure to open to new ideas!";
	}
	@RequestMapping("daikichi/today")
	public String today() {
		return "Today you will find luck in all your endeavors.";
	}
}
