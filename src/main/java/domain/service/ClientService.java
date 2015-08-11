package domain.service;

import java.util.List;
import java.util.Map;

import domain.model.Application;
import domain.model.Client;
import domain.model.Detail;
import domain.model.Guest;
import domain.model.Mechanic;
import domain.model.Review;
import domain.model.Service;
import domain.model.Status;
import domain.model.Sto;
import domain.model.UserPrincipal;

//��������� ��������� �������� c �������� ������ Client
public interface ClientService {

 // ����� ���������� ������ ���� ���
 List<Sto> getAllSto();

 // ����� ���������� ������ ������� � ������ ������������� ���
 List<Review> getStoAllReview(Sto sto);

 // ����� ���������� ������ ���� ��������� �� ������������ ���
 List<Mechanic> getStoAllMechanic(Sto sto);

 // ����� ���������� ������ ������� � ������ ������������� ��������
 List<Review> getMechanicAllReview(Mechanic mechanic);

 // ����� ������� ����� � ��������� �������� � ������� ��� � ��������
 void createAuthorizedOrder(String problem, Sto sto, Mechanic mechanic);

 // �������� ������ �� �������������� ��������(��� ����������� ������
 // ���������)
 void createNoAuthorizedOrder(Guest guest, String problem, Sto sto);

 // ���������� ������ ������� ������ �� ��������� �������������
 // ��������������� �������
 Map<Application, Status> getApplication(UserPrincipal user);

 // ����� ��������� ����� �� ������ ���
 void changeSto(Application application, Sto Sto);
 
 //����� ������� ����� � ������
 Review createReview(Review review,UserPrincipal user, boolean visible);

 // ����� ���������� ����� � ������ ������ ���
 void estimateSto(Sto sto, Review review);

 // ����� ���������� ����� � ������ ������ ��������
 void estimateMechanic(Mechanic mechanic, Review review);
 
 //����� ���������� ������ ��������� � �� ��������� �� �������� ���
 Map<Detail,Long> getDelaitSto(Sto sto);

 //����� ���������� ������ ���� �������� � �� ��������� �� �������� ���
 Map<Service,Long> getServiceSto(Sto sto);

}