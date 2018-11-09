package com.quemepongo.springapp.web.controllers;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class UsuarioController {
	
	protected final Log logger = LogFactory.getLog(getClass());

	@RequestMapping(value="/hello.htm")
    public ModelAndView handleRequest() {
		logger.info("Estamos en el controller");
        return new ModelAndView("hello");
    }
}
