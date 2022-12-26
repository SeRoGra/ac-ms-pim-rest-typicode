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
import co.com.accenture.acmspimresttypicode.dto.response.PhotoDTOResponse;
import co.com.accenture.acmspimresttypicode.service.IAlbumService;
import lombok.extern.slf4j.Slf4j;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/album")
@Slf4j
public class AlbumController {
	
	@Autowired
	IAlbumService albumService;
	
	@GetMapping(path = "/{id}/photos")
	public ResponseEntity<List<PhotoDTOResponse>> getPhotosByAlbum(@PathVariable(name = "id") Integer albumId) {
		
		return new ResponseEntity<List<PhotoDTOResponse>>(albumService.getPhotosByAlbum(albumId), HttpStatus.OK);
		
	}
	
	@GetMapping()
	public ResponseEntity<List<AlbumDTOResponse>> getAllAlbums() {
		
		return new ResponseEntity<List<AlbumDTOResponse>>(albumService.getAllAlbums(), HttpStatus.OK);
		
	}

}
