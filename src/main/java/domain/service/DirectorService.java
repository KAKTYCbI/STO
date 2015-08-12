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
	
	//метод возращает список  всех заявок
	List<Application> getApplication();
	
	//метод возращает список  всех заявок на детали
	List<ApplicationDetail> getApplicationDetail();
	
	//метод возращает список  всех Механиков
	List<Mechanic> getMechanics();
	
	//метод возращает список  всех Механиков на конкретном сто
	List<Mechanic> getMechanicsOnSto(Sto sto);
	
	//метод возращает список  всех СТО
    List<Sto> getSto();
    
    //метод дабавляет делать
    void addDetail(Detail detail);
    
    //метод дабавляет механика или обнавляет его данные
    void saveOrUpdateMechanic(Mechanic mechanic);
    
    //метод дабавляет аренду на конкретном сто
    void addRent(Rent rent, Sto sto);
	
    //метод дабавляет услугу
    void addService(Service service);
    
    //метод удалет механика
    void deleteMechanic(Mechanic mechanic);
    
    //метод изменяет статус заявки
    void updateStatusApplication(Application application, Status status);
    
    //метод дабавляет механика в заявку
    void addMechanicApplication(Application application, Mechanic mechanic);
	
    //метод обнавлет(сохраняет) заявку на деталь
    void saveApplicationDetail(ApplicationDetail applicationDetail,Status status,Date date);

}
