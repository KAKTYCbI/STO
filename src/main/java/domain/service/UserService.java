package domain.service;

import domain.model.UserPrincipal;

public interface UserService {
	
	UserPrincipal getUser(String login, String password);

	UserPrincipal getUserByID(Long userId);

	UserPrincipal getUserByName(String username);
	
	// ���������� ��������� ���������� �� �������� �� �������
    void saveUser(UserPrincipal user);

	// �������� ���������� �������
	void deleteUser(UserPrincipal user);
}
