package domain.service;

import java.util.List;

import domain.model.Review;
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
	 
	 // ����� ���������� ������ ���� �������
     List<Review> getReview();
		 
	 // ���������� ��������� ���������� �� �������� �� �������
	 void saveUser(UserPrincipal user);

	 // �������� ���������� �������
	 void deleteUser(UserPrincipal user);

}
