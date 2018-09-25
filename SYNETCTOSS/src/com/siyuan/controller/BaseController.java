package com.siyuan.controller;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

import com.siyuan.util.DateEditor;

public class BaseController {
	
	@InitBinder
    protected void initBinder(WebDataBinder binder) {
		binder.registerCustomEditor(
				java.sql.Date.class, new DateEditor());
    }
	
}
