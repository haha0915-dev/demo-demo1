package com.proj.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/boards")

public class TestController {
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String list() throws Exception {
		/**
		 * ------------------------------------------------
		 * dahskdfhlasdf
		 * asdfhalsdfhals
		 * afdhlasdf
		 * ------------------------------------------------
		 * sadfaskldf
		 * sdfaskdf
		 * ------------------------------------------------
		 * sadfaskldf
		 * sdfaskdf
		 * ------------------------------------------------
		 * sadfaskldf
		 * sdfaskdf
		 * ------------------------------------------------ 
		 */
		return "ddd:ddd";		
	}

}
