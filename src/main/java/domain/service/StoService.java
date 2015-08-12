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

	 // ����� ���������� ������ ���� ���
	 List<Sto> getAllSto();
	 
	// ����� ���������� ������ ������� � ������ ������������� ���
	 List<Review> getStoAllReview(Sto sto);
	 
	 // ����� ���������� ������ ���� ��������� �� ������������ ���
	 List<Mechanic> getStoAllMechanic(Sto sto);
	 
	//����� ���������� ������ ��������� � �� ��������� �� �������� ���
	 Map<Detail,Long> getDelaitSto(Sto sto);
	 
	//����� ���������� ������ ���� �������� � �� ��������� �� �������� ���
	 Map<Service,Long> getServiceSto(Sto sto);

}
