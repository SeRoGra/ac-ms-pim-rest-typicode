package co.com.accenture.acmspimresttypicode.service;

import java.util.List;

import co.com.accenture.acmspimresttypicode.dto.response.AlbumDTOResponse;
import co.com.accenture.acmspimresttypicode.dto.response.PhotoDTOResponse;

public interface IAlbumService {
	
	List<PhotoDTOResponse> getPhotosByAlbum(Integer albumId);

	List<AlbumDTOResponse> getAllAlbums();
	
}
