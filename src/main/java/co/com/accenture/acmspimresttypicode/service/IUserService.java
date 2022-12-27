package co.com.accenture.acmspimresttypicode.service;

import java.util.List;

import co.com.accenture.acmspimresttypicode.dto.response.AlbumDTOResponse;
import co.com.accenture.acmspimresttypicode.dto.response.PostDTOResponse;
import co.com.accenture.acmspimresttypicode.dto.response.UserDTOResponse;

public interface IUserService {
	
	public List<UserDTOResponse> getAllUsers();
	
	public UserDTOResponse getUserById(Integer userId);
	
	public List<AlbumDTOResponse> getAlbumsByUser(Integer userId);
	
	public List<PostDTOResponse> getPostByUser(Integer userId);

}
