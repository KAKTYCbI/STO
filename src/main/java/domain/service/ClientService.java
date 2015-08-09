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

//интерфейс описывает действия c обьктами класса Client
public interface ClientService {
 // сохранение введенной информации об аккаунте от клиента
 void saveClient(Client client);

 // удаление выбранного клиента
 void deleteClient(Client client);

 // метод возвращает список всех клиентов
 List<Client> getClients();

 // Авторизация пользователя на сайте
 Client getUser(String email, String password);

 // метод возвращает список всех СТО
 List<Sto> getAllSto();

 // метод возвращает список отзывов и оценок определенного СТО
 List<Review> getStoAllReview(Sto sto);

 // метод возвращает список всех механиков на определенном сто
 List<Mechanic> getStoAllMechanic(Sto sto);

 // метод возвращает список отзывов и оценок определенного механика
 List<Review> getMechanicAllReview(Mechanic mechanic);

 // метод создает заказ с описанием проблемы и выбором СТО и механика
 void createAuthorizedOrder(String problem, Sto sto, Mechanic mechanic);

 // создание заказа не авторизованным клиентом(без возможности выбора
 // механикка)
 void createNoAuthorizedOrder(Guest guest, String problem, Sto sto);

 // возвращает список заказов вмести со статусами определенного
 // авторизованного клиента
 Map<Application, Status> getApplication(Client client);

 // метод переносит заказ на другое СТО
 void changeSto(Application application, Sto Sto);
 
 //метод создает отзыв и оценку
 Review createReview(Review review,Client client, boolean visible);

 // метод выставляет отзыв и оценку работы СТО
 void estimateSto(Sto sto, Review review);

 // метод выставляет отзыв и оценку работы механика
 void estimateMechanic(Mechanic mechanic, Review review);
 
 //метод возвращает список делателей и их стоимость на заданном СТО
 Map<Detail,Long> getDelaitSto(Sto sto);

 //метод возвращает список всех сервисов и их стоимость на заданном СТО
 Map<Service,Long> getServiceSto(Sto sto);

}