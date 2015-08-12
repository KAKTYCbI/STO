package domain.service;

import java.util.Map;

import domain.model.Application;
import domain.model.Guest;
import domain.model.Mechanic;
import domain.model.Review;
import domain.model.Status;
import domain.model.Sto;
import domain.model.UserPrincipal;

public interface ClientService {

 // метод создает заказ с описанием проблемы и выбором СТО и механика
 void createAuthorizedOrder(String problem, Sto sto, Mechanic mechanic);

 // создание заказа не авторизованным клиентом(без возможности выбора
 // механикка)
 void createNoAuthorizedOrder(Guest guest, String problem, Sto sto);

 // возвращает список заказов вмести со статусами определенного
 // авторизованного клиента
 Map<Application, Status> getApplication(UserPrincipal user);

 // метод переносит заказ на другое СТО
 void changeSto(Application application, Sto Sto);
 
 //метод создает отзыв и оценку
 Review createReview(Review review,UserPrincipal user, boolean visible);

 // метод выставляет отзыв и оценку работы СТО
 void estimateSto(Sto sto, Review review);

 // метод выставляет отзыв и оценку работы механика
 void estimateMechanic(Mechanic mechanic, Review review);
 
}