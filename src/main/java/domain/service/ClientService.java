package domain.service;

import java.util.List;

import domain.model.Application;
import domain.model.Client;
import domain.model.Message;
import domain.model.Review;
import domain.model.Sto;

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