package com.springNew.springNew;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author krishnakumar
 *
 */
@RestController
@RequestMapping
public class ControllerTest {
	
	@GetMapping("/getApi")
	public String getApi() {
		return "get Rest Apis using container";
	}
	@PostMapping("/getApi")
	public String postApi() {
		return "post Rest Apis using container";
	}
}
