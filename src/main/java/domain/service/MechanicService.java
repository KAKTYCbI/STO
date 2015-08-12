package domain.service;
import java.util.Date;
import java.util.List;
import java.util.Map;

import domain.model.Application;
import domain.model.Detail;
import domain.model.Mechanic;
import domain.model.Review;
import domain.model.Service;
import domain.model.Status;
import domain.model.Sto;

public interface MechanicService {

	 // ����� ���������� ������ ������ ��������� ��������
	 List<Application> getCurrentApplication(Mechanic mechanic, Sto sto);
	 
	 //����� ������ ������ ������ 
	 void SetStatus(Application order,Status status);
	 
	 //����� ������ ��������� ������
	 void setPrice(Application order, Service service);
	 
	 //����� ������ ���� ���������� ������
	 void setDate(Application application, Date date);
	 
	 //����� ���������� ������ ����������� �����
	 List<Service> doneServise(Application order,Service service);
	 
	 //����� ���������� ������ ���������� �������
	 List<Detail> doneDetail(Application order,Detail detail);
	 
	 //����� ���������� ������ ��������� � �� ��������� �� �������� ���
	 Map<Detail,Integer> getCurrentDiteil(Sto sto, Detail detail);
	    
	 //����� ������� ������ �� ��������(��������)
	 void orderDetail(Mechanic mechanic, Map<Detail,Integer> detail);
	    
	 //����� ������� ��������� ��� �������� ������
	 void notification(Application order, String text);
	    
	 // ����� ���������� ������ ������� � ������ ������������� ��������
	 List<Review> getMechanicAllReview(Mechanic mechanic);

	 
	}