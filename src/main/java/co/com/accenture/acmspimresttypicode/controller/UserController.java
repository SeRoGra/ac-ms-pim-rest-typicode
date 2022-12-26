package co.com.accenture.acmspimresttypicode.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.accenture.acmspimresttypicode.dto.response.User;
import co.com.accenture.acmspimresttypicode.service.IUserService;
import lombok.extern.slf4j.Slf4j;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {
	
	@Autowired
	IUserService userService;

	@GetMapping()
	public ResponseEntity<List<User>> getAllUsers() {
		
		log.info("AQUI");
		return new ResponseEntity<List<User>>(userService.getAllUsers(), HttpStatus.OK);
		
	}

}
