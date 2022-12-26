package co.com.accenture.acmspimresttypicode.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.accenture.acmspimresttypicode.client.ITypicodeClient;
import co.com.accenture.acmspimresttypicode.dto.response.CommentDTOResponse;
import co.com.accenture.acmspimresttypicode.dto.response.PostDTOResponse;
import co.com.accenture.acmspimresttypicode.service.IPostService;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class PostServiceImpl implements IPostService {

	@Autowired
	ITypicodeClient typicodeClient;
	
	@Override
	public List<PostDTOResponse> getAllPost() {
		
		List<PostDTOResponse> response = null;
		
		try {
			response = typicodeClient.getAllPost();
		} catch (Exception e) {
			log.error("Se presento la siguiente excepcion: " + e.getMessage());
		}
		
		return response;
	}

	@Override
	public List<CommentDTOResponse> getCommentsByPost(Integer postId) {
		
		List<CommentDTOResponse> response = null;
		
		try {
			response = typicodeClient.getCommentsByPost(postId);
		} catch (Exception e) {
			log.error("Se presento la siguiente excepcion: " + e.getMessage());
		}
		
		return response;
	}

}
