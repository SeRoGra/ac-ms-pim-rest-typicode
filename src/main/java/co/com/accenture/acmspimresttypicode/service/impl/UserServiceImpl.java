package co.com.accenture.acmspimresttypicode.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.accenture.acmspimresttypicode.client.ITypicodeClient;
import co.com.accenture.acmspimresttypicode.dto.response.AlbumDTOResponse;
import co.com.accenture.acmspimresttypicode.dto.response.PostDTOResponse;
import co.com.accenture.acmspimresttypicode.dto.response.UserDTOResponse;
import co.com.accenture.acmspimresttypicode.service.IUserService;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserServiceImpl implements IUserService {

	@Autowired
	ITypicodeClient typicodeClient;

	@Override
	public List<UserDTOResponse> getAllUsers() {

		List<UserDTOResponse> response = null;

		try {
			response = typicodeClient.getAllUsers();
		} catch (Exception e) {
			log.error("Se presento la siguiente excepcion: " + e.getMessage());
		}

		return response;

	}

	@Override
	public List<AlbumDTOResponse> getAlbumsByUser(Integer userId) {

		List<AlbumDTOResponse> response = null;

		try {
			response = typicodeClient.getAlbumsByUser(userId);
		} catch (Exception e) {
			log.error("Se presento la siguiente excepcion: " + e.getMessage());
		}

		return response;
	}

	@Override
	public List<PostDTOResponse> getPostByUser(Integer userId) {

		List<PostDTOResponse> response = null;

		try {
			response = typicodeClient.getPostByUser(userId);
		} catch (Exception e) {
			log.error("Se presento la siguiente excepcion: " + e.getMessage());
		}

		return response;
	}

}
