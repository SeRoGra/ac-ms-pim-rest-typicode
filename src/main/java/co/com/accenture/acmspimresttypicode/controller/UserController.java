package co.com.accenture.acmspimresttypicode.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.accenture.acmspimresttypicode.dto.response.AlbumDTOResponse;
import co.com.accenture.acmspimresttypicode.dto.response.PostDTOResponse;
import co.com.accenture.acmspimresttypicode.dto.response.UserDTOResponse;
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
	public ResponseEntity<List<UserDTOResponse>> getAllUsers() {
		
		return new ResponseEntity<List<UserDTOResponse>>(userService.getAllUsers(), HttpStatus.OK);
		
	}
	
	@GetMapping(path = "/{id}")
	public ResponseEntity<UserDTOResponse> getUserById(@PathVariable(name = "id") Integer userId) {
		
		return new ResponseEntity<UserDTOResponse>(userService.getUserById(userId), HttpStatus.OK);
		
	}
	
	@GetMapping(path = "/{id}/albums")
	public ResponseEntity<List<AlbumDTOResponse>> getAlbumsByUser(@PathVariable(name = "id") Integer userId) {
		
		return new ResponseEntity<List<AlbumDTOResponse>>(userService.getAlbumsByUser(userId), HttpStatus.OK);
		
	}
	
	@GetMapping(path = "/{id}/posts")
	public ResponseEntity<List<PostDTOResponse>> getPostByUser(@PathVariable(name = "id") Integer userId) {
		
		return new ResponseEntity<List<PostDTOResponse>>(userService.getPostByUser(userId), HttpStatus.OK);
		
	}

}
