package co.com.accenture.acmspimresttypicode.service;

import java.util.List;

import co.com.accenture.acmspimresttypicode.dto.response.CommentDTOResponse;
import co.com.accenture.acmspimresttypicode.dto.response.PostDTOResponse;

public interface IPostService {

	List<PostDTOResponse> getAllPost();

	List<CommentDTOResponse> getCommentsByPost(Integer postId);

}
