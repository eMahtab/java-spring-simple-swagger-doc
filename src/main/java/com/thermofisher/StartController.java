package com.thermofisher;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class StartController {

	@RequestMapping(value = "/hello", produces = { "application/JSON" })
	@ResponseBody
    public String getGreeting() {
        return " Heyyo, awesome! :) ";
    }
}