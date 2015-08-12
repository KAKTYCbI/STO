package app.service;

import java.util.List;

import domain.model.Application;
import domain.model.ApplicationDetail;
import domain.model.Detail;
import domain.model.Mechanic;
import domain.model.Rent;
import domain.model.Service;
import domain.model.Sto;
import domain.service.DirectorService;

public class DirectorServiceImplement implements DirectorService{

	
	
	@Override
	public List<Application> getApplication() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ApplicationDetail> getApplicationDetail() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Mechanic> getMechanics() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Mechanic> getMechanicsOnSto(Sto sto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Sto> getSto() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addDetail(Detail detail) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveOrUpdateMechanic(Mechanic mechanic) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addRent(Rent rent, Sto sto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addService(Service service) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteMechanic(Mechanic mechanic) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateStatusApplication(Application application) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveApplicationDetail(ApplicationDetail applicationDetail) {
		// TODO Auto-generated method stub
		
	}

}
