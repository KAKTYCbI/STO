package domain.service;

import java.util.List;
import java.util.Map;

import domain.model.Application;
import domain.model.Client;
import domain.model.Message;
import domain.model.Review;
import domain.model.Status;
import domain.model.Sto;
import domain.model.UserPrincipal;

public interface ClientService {

 // ����� ������� ����� � ��������� �������� � ������� ��� � ��������
	//c ������������ ���������� ������(������ ���)
 void addOrUpdateApplication(Application application);

 //����� ��������� ����������� ������������ �������
 List<Message> getMessageByClient(Client client);
 
 //����� ��������� �����
 void addReview(Review review);
 
 // ���������� ������ ������� ������ �� ��������� �������������
 // ��������������� �������
 List<Application> getApplication(Client client);
 
 //����� ��������� ������ ���
 List<Sto> getAllSto();
 
}