package domain.service;


import java.util.List;






import domain.model.Application;
import domain.model.ApplicationDetail;
import domain.model.Detail;
import domain.model.Mechanic;
import domain.model.Rent;
import domain.model.Service;
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
    
    //����� ��������  ������
    void updateApplication(Application application);
	
    //����� ��������(���������) ������ �� ������
    void saveApplicationDetail(ApplicationDetail applicationDetail);

}
