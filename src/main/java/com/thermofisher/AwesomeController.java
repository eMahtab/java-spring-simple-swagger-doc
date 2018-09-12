package com.thermofisher;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class AwesomeController {

	@RequestMapping(value = "/awesome", produces = { "application/JSON" })
	@ResponseBody
    public String sayAwesome() {
        return "{ \"message\" :" + " \"Heyyo, awesome! :) \" }";
    }
}