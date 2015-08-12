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

	 // метод возвращает список заявок заданного механика
	 List<Application> getCurrentApplication(Mechanic mechanic, Sto sto);
	 
	 //метод меняет статус заказа 
	 void SetStatus(Application order,Status status);
	 
	 //метод ставит стоимость работы
	 void setPrice(Application order, Service service);
	 
	 //метод ставит дату проведения работы
	 void setDate(Application application, Date date);
	 
	 //метод возвращает список выполненных работ
	 List<Service> doneServise(Application order,Service service);
	 
	 //метод возвращает список замененных деталей
	 List<Detail> doneDetail(Application order,Detail detail);
	 
	 //метод возвращает список запчастей и их количеста на заданном СТО
	 Map<Detail,Integer> getCurrentDiteil(Sto sto, Detail detail);
	    
	 //метод создает заявку на запчасть(запчасти)
	 void orderDetail(Mechanic mechanic, Map<Detail,Integer> detail);
	    
	 //метод создает сообщение для заданной заявки
	 void notification(Application order, String text);
	    
	 // метод возвращает список отзывов и оценок определенного механика
	 List<Review> getMechanicAllReview(Mechanic mechanic);

	 
	}