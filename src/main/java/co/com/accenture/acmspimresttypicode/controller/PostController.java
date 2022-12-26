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

import co.com.accenture.acmspimresttypicode.dto.response.CommentDTOResponse;
import co.com.accenture.acmspimresttypicode.dto.response.PostDTOResponse;
import co.com.accenture.acmspimresttypicode.service.IPostService;
import lombok.extern.slf4j.Slf4j;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/post")
@Slf4j
public class PostController {

	@Autowired
	IPostService postService;

	@GetMapping()
	public ResponseEntity<List<PostDTOResponse>> getAllPost() {

		return new ResponseEntity<List<PostDTOResponse>>(postService.getAllPost(), HttpStatus.OK);

	}

	@GetMapping(path = "/{id}/comments")
	public ResponseEntity<List<CommentDTOResponse>> getCommentsByPost(@PathVariable(name = "id") Integer postId) {
		
		return new ResponseEntity<List<CommentDTOResponse>>(postService.getCommentsByPost(postId), HttpStatus.OK);
		
	}

}
