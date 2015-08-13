package domain.service;
import java.util.List;
import domain.model.Application;
import domain.model.ApplicationDetail;
import domain.model.Mechanic;
import domain.model.Message;

public interface MechanicService {

	 // метод возвращает список заявок заданного механика
	 List<Application> getCurrentApplication(Mechanic mechanic);
	 
	 //метод возращает список заявок на детали у определенного механика
	 List<ApplicationDetail> getAllApplicationDetail(Mechanic mechanic);
	 
	 //метод обнавляет заявку
	 void updateApplication(Application application);
	 
	 //возращает заявку по Id
	 Application getApplicationById(Long Id);
	    
	 //метод создает заявку на запчасть(запчасти)
	 void orderDetail(ApplicationDetail applicationDetail);
	    
	 //метод создает сообщение
	 void notification(Message message);
     
	 
	}