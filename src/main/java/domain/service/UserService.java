package domain.service;

import domain.model.UserPrincipal;

public interface UserService {
	
	UserPrincipal loadUserByCredentials(String login, String password);

	UserPrincipal getUserByID(Long userId);

	UserPrincipal getUserByName(String username);
}
