package co.com.accenture.acmspimresttypicode.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import co.com.accenture.acmspimresttypicode.dto.response.AlbumDTOResponse;
import co.com.accenture.acmspimresttypicode.dto.response.CommentDTOResponse;
import co.com.accenture.acmspimresttypicode.dto.response.PhotoDTOResponse;
import co.com.accenture.acmspimresttypicode.dto.response.PostDTOResponse;
import co.com.accenture.acmspimresttypicode.dto.response.UserDTOResponse;

@FeignClient(name = "typicodeClient", url = "${spring.clients.typicode.url}")
public interface ITypicodeClient {

	// User
	@RequestMapping(method = RequestMethod.GET, value = "/users")
	public List<UserDTOResponse> getAllUsers();
	
	@RequestMapping(method = RequestMethod.GET, value = "/users/{id}")
	public UserDTOResponse getUserById(@PathVariable(name = "id") Integer userId);
	
	@RequestMapping(method = RequestMethod.GET, value = "/users/{id}/albums")
	public List<AlbumDTOResponse> getAlbumsByUser(@PathVariable(name = "id") Integer userId);
	
	@RequestMapping(method = RequestMethod.GET, value = "/users/{id}/posts")
	public List<PostDTOResponse> getPostByUser(@PathVariable(name = "id") Integer userId);
	
	// Albums
	@RequestMapping(method = RequestMethod.GET, value = "/albums")
	public List<AlbumDTOResponse> getAllAlbums();
	
	@RequestMapping(method = RequestMethod.GET, value = "/album/{id}/photos")
	public List<PhotoDTOResponse> getPhotosByAlbum(@PathVariable(name = "id") Integer albumId);
	
	// Photo
	
	// Post
	@RequestMapping(method = RequestMethod.GET, value = "/posts")
	public List<PostDTOResponse> getAllPost();
	
	@RequestMapping(method = RequestMethod.GET, value = "/posts/{id}/comments")
	public List<CommentDTOResponse> getCommentsByPost(@PathVariable(name = "id") Integer postId);
	
	// Comment

}