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

// ��� ������ � �����������
public interface ReportService {

 // ����� ��������� �� �������� �� ������������ ����
 void setMechanicSalary(Mechanic mechanic, Salary salary);

 // ����� ���������� ������ ��� � ���� �� ��������� ��������
 Map<Date, Double> getListMechanicSalary(Mechanic mechanic, Salary salary);

 // ����� ��������� �� ��������� �� ������������ ����
 void setDirectorSalary(Director director, Salary salary);

 // ����� ���������� ������ ��� � ���� �� ��������� ���������
 Map<Date, Double> getListDirectorSalary(Director director, Salary salary);

 // ����� ��������� �������� ����� ������������� ��� �� ����
 void setSTORent(Sto sto, Rent rent);

 // ����� ���������� ������ ��� � ���� �������� ����� ��������� ���
 Map<Date, Long> getListSTORent(Sto sto, Rent rent);

 // ����� ���������� ������ ��������� ����� ��������� ��� � �� ���������
 Map<Service, Long> getListStoService(Sto sto);

 // ����� ���������� ������ ��������� ����� ��������� �������� � �� ���������
 Map<Service, Long> getListMechanicService(Mechanic mechanic);
 
 //����� ���������� ������ � ������ ��������� �� ������������ ���
 Map<Mechanic,Review> getMechanicReview(Sto sto);
 
 //����� ���������� ������� ��� �� ������������ ���������� �������
 Long getStoProfit(Sto sto, Date start, Date finish);
 
 //����� ���������� ����� �������� ����� �� ������������ ������ �������
    Long getStoRent(Sto sto, Date start, Date finish);
    
    //����� ���������� ����� �� ��������� � ���������� �� ������������ ������ �������
    Long geStoSalary(Sto sto, Date start, Date finish);
    
   //����� ���������� ������ ������� �� �������� ���
    List<Application> getListApplicationSto(Sto sto);
    
}
