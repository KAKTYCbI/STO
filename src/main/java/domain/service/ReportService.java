package domain.service;

import java.util.Date;
import java.util.List;

import domain.model.Application;
import domain.model.Director;
import domain.model.Mechanic;
import domain.model.Rent;
import domain.model.Salary;
import domain.model.Sto;

// ��� ������ � �����������
public interface ReportService {

 
 // ����� ���������� �� �� �������� ������
 List<Salary> getListSalary(Date dateStart, Date dateFinish);

 // ����� ���������� �� ��������� ��������� �� ������
 List<Salary> getListDirectorSalary(Director director, Date dateStart, Date dateFinish);

  //����� ���������� �� �� �������� ������
  List<Salary> getListMechanicSalary(Mechanic mechanic, Date dateStart, Date dateFinish);


 // ����� ���������� ������ ��������� ��� �� ������
 List<Rent> getListSTORent(Sto sto, Date dateStart, Date dateFinish);

 // ����� ���������� ������ ���������� ������ ��������� ���
 List<Application> getListStoApplicationToDate(Sto sto, Date dateStart, Date dateFinish);

 // ����� ���������� ������ ���������� ������ ��������� ��������
 List<Application> getListMechanicApplicationToDate(Mechanic mechanic,Date dateStart, Date dateFinish);
 
 
    
}
