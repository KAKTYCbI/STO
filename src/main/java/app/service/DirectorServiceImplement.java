package app.service;

import java.util.ArrayList;
import java.util.List;

import org.dozer.DozerBeanMapperSingletonWrapper;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;

import app.repository.dao.ApplicationDao;
import app.repository.dao.ApplicationDetailDao;
import app.repository.entity.ApplicationDetailEntity;
import app.repository.entity.ApplicationEntity;
import app.repository.entity.map.ModelClassMap;
import domain.model.Application;
import domain.model.ApplicationDetail;
import domain.model.Detail;
import domain.model.Mechanic;
import domain.model.Rent;
import domain.model.Service;
import domain.model.Sto;
import domain.service.DirectorService;

public class DirectorServiceImplement implements DirectorService{

	@Autowired
	private ApplicationDao applicationRepository;
	
	@Autowired
	private ApplicationDetailDao applicationDetailRepository;
	

	@Autowired
	private ModelClassMap modelClassMap;
	
	private Mapper getMapper() {
		return DozerBeanMapperSingletonWrapper.getInstance();
	}
	@Override
	public List<Application> getApplication() {
		List<Application> application = new ArrayList<Application>();
		List<ApplicationEntity> ApplicationEntities = applicationRepository.findAll();
		for(ApplicationEntity ApplicationEntity : ApplicationEntities) {
			application.add(getMapper().map(ApplicationEntity, Application.class));
		}
		return application;
	}

	@Override
	public List<ApplicationDetail> getApplicationDetail() {
		List<ApplicationDetail> applicationDetail = new ArrayList<ApplicationDetail>();
		List<ApplicationDetailEntity> applicationDetailEntities = applicationDetailRepository.findAll();
		for(ApplicationDetailEntity ApplicationDetailEntity : applicationDetailEntities) {
			applicationDetail.add(getMapper().map(ApplicationDetailEntity, ApplicationDetail.class));
		}
		return applicationDetail;
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
	public void saveApplicationDetail(ApplicationDetail applicationDetail) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateApplication(Application application) {
		// TODO Auto-generated method stub
		
	}

}
