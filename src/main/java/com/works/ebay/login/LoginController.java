package com.works.ebay.login;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class LoginController {
	
	@RequestMapping("/login")
    public String index() {
        return "Login to eBay";
    }
}
