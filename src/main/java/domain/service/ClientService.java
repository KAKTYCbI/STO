package domain.service;

import java.util.List;

import domain.model.Application;
import domain.model.Client;
import domain.model.Message;
import domain.model.Review;
import domain.model.Sto;

public interface ClientService {

 // метод создает заказ с описанием проблемы и выбором СТО и механика
	//c возмощностью обнавления заявки(выбора СТО)
 void addOrUpdateApplication(Application application);

 //метод возращает уведомления определеного клиента
 List<Message> getMessageByClient(Client client);
 
 //метод дабавляет отзыв
 void addReview(Review review);
 
 // возвращает список заказов вмести со статусами определенного
 // авторизованного клиента
 List<Application> getApplication(Client client);
 
 //метод возращает список СТО
 List<Sto> getAllSto();
 
}