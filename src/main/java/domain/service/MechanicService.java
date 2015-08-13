package domain.service;
import java.util.List;
import domain.model.Application;
import domain.model.ApplicationDetail;
import domain.model.Mechanic;
import domain.model.Message;

public interface MechanicService {

	 // ����� ���������� ������ ������ ��������� ��������
	 List<Application> getCurrentApplication(Mechanic mechanic);
	 
	 //����� ��������� ������ ������ �� ������ � ������������� ��������
	 List<ApplicationDetail> getAllApplicationDetail(Mechanic mechanic);
	 
	 //����� ��������� ������
	 void updateApplication(Application application);
	 
	 //��������� ������ �� Id
	 Application getApplicationById(Long Id);
	    
	 //����� ������� ������ �� ��������(��������)
	 void orderDetail(ApplicationDetail applicationDetail);
	    
	 //����� ������� ���������
	 void notification(Message message);
     
	 
	}