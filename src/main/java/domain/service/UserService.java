<<<<<<< HEAD
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
=======
package domain.service;

import java.util.List;

import domain.model.UserPrincipal;

public interface UserService {
	
	 // ����������� ������������ �� �����
	 UserPrincipal getUser(String login, String password);
	 
	 //���������� ������������ �� ��
	 UserPrincipal getUserByID(Long userId);
	 
	 //���������� ������������ �� �����
	 UserPrincipal getUserByName(String name);
	 
	 // ����� ���������� ������ ���� ��������
	 List<UserPrincipal> getUsers();
	 
	 // ���������� ��������� ���������� �� �������� �� �������
	 void saveUser(UserPrincipal user);

	 // �������� ���������� �������
	 void deleteUser(UserPrincipal user);

}
>>>>>>> ad04533f3eb4b9af3fdb3e1db76b6b4e7402cc8b
