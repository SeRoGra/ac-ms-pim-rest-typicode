package co.com.accenture.acmspimresttypicode.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.accenture.acmspimresttypicode.client.ITypicodeClient;
import co.com.accenture.acmspimresttypicode.dto.response.AlbumDTOResponse;
import co.com.accenture.acmspimresttypicode.dto.response.PhotoDTOResponse;
import co.com.accenture.acmspimresttypicode.service.IAlbumService;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class AlbumServiceImpl implements IAlbumService {

	@Autowired
	ITypicodeClient typicodeClient;

	@Override
	public List<PhotoDTOResponse> getPhotosByAlbum(Integer albumId) {

		List<PhotoDTOResponse> response = null;

		try {
			response = typicodeClient.getPhotosByAlbum(albumId);
		} catch (Exception e) {
			log.error("Se presento la siguiente excepcion: " + e.getMessage());
		}

		return response;
	}

	@Override
	public List<AlbumDTOResponse> getAllAlbums() {

		List<AlbumDTOResponse> response = null;

		try {

			response = typicodeClient.getAllAlbums();

		} catch (Exception e) {
			log.error("Se presento la siguiente excepcion: " + e.getMessage());
		}

		return response;
	}

}
