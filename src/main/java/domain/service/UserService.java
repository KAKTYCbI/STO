<<<<<<< HEAD
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
=======
package domain.service;

import java.util.List;

import domain.model.UserPrincipal;

public interface UserService {
	
	 // Авторизация пользователя на сайте
	 UserPrincipal getUser(String login, String password);
	 
	 //возвращает пользователя по ИД
	 UserPrincipal getUserByID(Long userId);
	 
	 //возвращает пользователя по имени
	 UserPrincipal getUserByName(String name);
	 
	 // метод возвращает список всех клиентов
	 List<UserPrincipal> getUsers();
	 
	 // сохранение введенной информации об аккаунте от клиента
	 void saveUser(UserPrincipal user);

	 // удаление выбранного клиента
	 void deleteUser(UserPrincipal user);

}
>>>>>>> ad04533f3eb4b9af3fdb3e1db76b6b4e7402cc8b
