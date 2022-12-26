package co.com.accenture.acmspimresttypicode.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.accenture.acmspimresttypicode.client.ITypicodeClient;
import co.com.accenture.acmspimresttypicode.dto.response.User;
import co.com.accenture.acmspimresttypicode.service.IUserService;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserServiceImpl implements IUserService {

	@Autowired
	ITypicodeClient typicodeClient;

	@Override
	public List<User> getAllUsers() {

		List<User> users = null;

		try {
			log.info("Llego");
			users = typicodeClient.getAllUsers();
		} catch (Exception e) {
			log.error("Se presento la siguiente excepcion: " + e.getMessage());
		}

		return users;

	}

}
