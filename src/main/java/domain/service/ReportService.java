package domain.service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import domain.model.Application;
import domain.model.Detail;
import domain.model.Director;
import domain.model.Mechanic;
import domain.model.Rent;
import domain.model.Review;
import domain.model.Salary;
import domain.model.Service;
import domain.model.Sto;

// для работы с отчетностью
public interface ReportService {

 // метод назначает зп механику на определенный день
 void setMechanicSalary(Mechanic mechanic, Salary salary);

 // метод возвращает список дат и сумм зп заданного механика
 Map<Date, Double> getListMechanicSalary(Mechanic mechanic, Salary salary);

 // метод назначает зп директору на определенный день
 void setDirectorSalary(Director director, Salary salary);

 // метод возвращает список дат и сумм зп заданного директора
 Map<Date, Double> getListDirectorSalary(Director director, Salary salary);

 // метод назначает арендную плату определенному СТО на день
 void setSTORent(Sto sto, Rent rent);

 // метод возвращает список дат и сумм арендной платы заданного СТО
 Map<Date, Long> getListSTORent(Sto sto, Rent rent);

 // метод возвращает список оказанных услуг заданного СТО и их стоимость
 Map<Service, Long> getListStoService(Sto sto);

 // метод возвращает список оказанных услуг заданного механика и их стоимость
 Map<Service, Long> getListMechanicService(Mechanic mechanic);
 
 //метод возвращает отзывы о работе механиков на определенном СТО
 Map<Mechanic,Review> getMechanicReview(Sto sto);
 
 //метод возвращает прибыль СТО за определенный промежуток времеми
 Long getStoProfit(Sto sto, Date start, Date finish);
 
 //метод возвращает сумму арендной платы за определенный период времени
    Long getStoRent(Sto sto, Date start, Date finish);
    
    //метод возвращает сумму зп механиков и директоров за определенный период времени
    Long geStoSalary(Sto sto, Date start, Date finish);
    
   //метод возвращает список заказов на заданном СТО
    List<Application> getListApplicationSto(Sto sto);
    
}
