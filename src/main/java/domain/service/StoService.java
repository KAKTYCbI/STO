package domain.service;

import java.util.List;
import java.util.Map;

import domain.model.Detail;
import domain.model.Mechanic;
import domain.model.Review;
import domain.model.Service;
import domain.model.Sto;

public interface StoService {
	
	 Sto findByName(String name);

	 // метод возвращает список всех СТО
	 List<Sto> getAllSto();
	 
	// метод возвращает список отзывов и оценок определенного СТО
	 List<Review> getStoAllReview(Sto sto);
	 
	 // метод возвращает список всех механиков на определенном сто
	 List<Mechanic> getStoAllMechanic(Sto sto);
	 
	//метод возвращает список делателей и их стоимость на заданном СТО
	 Map<Detail,Long> getDelaitSto(Sto sto);
	 
	//метод возвращает список всех сервисов и их стоимость на заданном СТО
	 Map<Service,Long> getServiceSto(Sto sto);

}
