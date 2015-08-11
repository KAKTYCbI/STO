package domain.service;

import domain.model.UserPrincipal;

public interface UserService {
	
	UserPrincipal getUser(String login, String password);

	UserPrincipal getUserByID(Long userId);

	UserPrincipal getUserByName(String username);
	
	// сохранение введенной информации об аккаунте от клиента
    void saveUser(UserPrincipal user);

	// удаление выбранного клиента
	void deleteUser(UserPrincipal user);
}
