package br.com.jenkins2.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SystemController {
	
	@Value("${applicationVersion}")
	private String version;
	
	@RequestMapping("/systemCheck/isAlive")
	@ResponseStatus(HttpStatus.OK)
	public Map<String, Object> isAlive() {
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("currentDate", new Date());
		map.put("application.version", version);
		
		return map;
	}
	
}
