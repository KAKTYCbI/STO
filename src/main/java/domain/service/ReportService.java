package domain.service;

import java.util.Date;
import java.util.List;

import domain.model.Application;
import domain.model.Director;
import domain.model.Mechanic;
import domain.model.Rent;
import domain.model.Salary;
import domain.model.Sto;

// для работы с отчетностью
public interface ReportService {

 
 // метод возвращает зп за указаный переуд
 List<Salary> getListSalary(Date dateStart, Date dateFinish);

 // метод возвращает зп заданного директора за переуд
 List<Salary> getListDirectorSalary(Director director, Date dateStart, Date dateFinish);

  //метод возвращает зп за указаный переуд
  List<Salary> getListMechanicSalary(Mechanic mechanic, Date dateStart, Date dateFinish);


 // метод возвращает аренду заданного СТО за переуд
 List<Rent> getListSTORent(Sto sto, Date dateStart, Date dateFinish);

 // метод возвращает список выполненых заявок заданного СТО
 List<Application> getListStoApplicationToDate(Sto sto, Date dateStart, Date dateFinish);

 // метод возвращает список выполненых заявок заданного механика
 List<Application> getListMechanicApplicationToDate(Mechanic mechanic,Date dateStart, Date dateFinish);
 
 
    
}
