package co.com.accenture.acmspimresttypicode.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import co.com.accenture.acmspimresttypicode.dto.response.User;

@FeignClient(name = "typicodeClient", url = "${spring.clients.typicode.url}")
public interface ITypicodeClient {
	
	@RequestMapping(method = RequestMethod.GET, value = "/users")
	public List<User> getAllUsers();

}