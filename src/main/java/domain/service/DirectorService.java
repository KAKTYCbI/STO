package domain.service;

import java.util.Date;
import java.util.List;






import domain.model.Application;
import domain.model.ApplicationDetail;
import domain.model.Detail;
import domain.model.Mechanic;
import domain.model.Rent;
import domain.model.Service;
import domain.model.Status;
import domain.model.Sto;


public interface DirectorService {
	
	//����� ��������� ������  ���� ������
	List<Application> getApplication();
	
	//����� ��������� ������  ���� ������ �� ������
	List<ApplicationDetail> getApplicationDetail();
	
	//����� ��������� ������  ���� ���������
	List<Mechanic> getMechanics();
	
	//����� ��������� ������  ���� ��������� �� ���������� ���
	List<Mechanic> getMechanicsOnSto(Sto sto);
	
	//����� ��������� ������  ���� ���
    List<Sto> getSto();
    
    //����� ��������� ������
    void addDetail(Detail detail);
    
    //����� ��������� �������� ��� ��������� ��� ������
    void saveOrUpdateMechanic(Mechanic mechanic);
    
    //����� ��������� ������ �� ���������� ���
    void addRent(Rent rent, Sto sto);
	
    //����� ��������� ������
    void addService(Service service);
    
    //����� ������ ��������
    void deleteMechanic(Mechanic mechanic);
    
    //����� �������� ������ ������
    void updateStatusApplication(Application application, Status status);
    
    //����� ��������� �������� � ������
    void addMechanicApplication(Application application, Mechanic mechanic);
	
    //����� ��������(���������) ������ �� ������
    void saveApplicationDetail(ApplicationDetail applicationDetail,Status status,Date date);

}
