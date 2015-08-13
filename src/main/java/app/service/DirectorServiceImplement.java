package app.service;

import java.util.ArrayList;
import java.util.List;

import org.dozer.DozerBeanMapperSingletonWrapper;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;

import app.repository.dao.ApplicationDao;
import app.repository.dao.ApplicationDetailDao;
import app.repository.dao.DetailDao;
import app.repository.dao.MechanicDao;
import app.repository.dao.RentDao;
import app.repository.dao.ServiceDao;
import app.repository.dao.StoDao;
import app.repository.entity.ApplicationDetailEntity;
import app.repository.entity.ApplicationEntity;
import app.repository.entity.DetailEntity;
import app.repository.entity.MechanicEntity;
import app.repository.entity.RentEntity;
import app.repository.entity.ServiceEntity;
import app.repository.entity.StoEntity;
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
	private MechanicDao mechanicRepository;

	@Autowired
	private StoDao stoRepository;
	
	@Autowired
	private ServiceDao serviceRepository;
	
	@Autowired
	private RentDao rentRepository;
	
	@Autowired
	private DetailDao detailRepository;
	
	
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
		List<Mechanic> mechanic = new ArrayList<Mechanic>();
		List<MechanicEntity> mechanicEntities = mechanicRepository.findAll();
		for(MechanicEntity MechanicEntity : mechanicEntities) {
			mechanic.add(getMapper().map(MechanicEntity, Mechanic.class));
		}
		return mechanic;
	}

	@Override
	public List<Mechanic> getMechanicsOnSto(Sto sto) {
		List<Mechanic> mechanic = new ArrayList<Mechanic>();
		List<MechanicEntity> mechanicEntities = mechanicRepository.findBySto(sto);
		for(MechanicEntity MechanicEntity : mechanicEntities) {
			mechanic.add(getMapper().map(MechanicEntity, Mechanic.class));
		}
		return mechanic;
	}

	@Override
	public List<Sto> getSto() {
		List<Sto> sto = new ArrayList<Sto>();
		List<StoEntity> stoEntities = stoRepository.findAll();
		for(StoEntity StoEntity : stoEntities) {
			sto.add(getMapper().map(StoEntity, Sto.class));
		}
		return sto;
	}

	@Override
	public void addDetail(Detail detail) {
		detailRepository.save((getMapper().map(detail, DetailEntity.class)));
		
	}

	@Override
	public void saveOrUpdateMechanic(Mechanic mechanic) {
		mechanicRepository.saveOrUpdate((getMapper().map(mechanic, MechanicEntity.class)));
		
	}

	@Override
	public void addRent(Rent rent) {
		
		rentRepository.save((getMapper().map(rent, RentEntity.class)));
	}

	@Override
	public void addService(Service service) {
	
		serviceRepository.save((getMapper().map(service, ServiceEntity.class)));
	}

	@Override
	public void deleteMechanic(Mechanic mechanic) {
	      mechanicRepository.delete((getMapper().map(mechanic, MechanicEntity.class)));
		
	}


	@Override
	public void saveApplicationDetail(ApplicationDetail applicationDetail) {
		applicationDetailRepository.update((getMapper().map(applicationDetail, ApplicationDetailEntity.class)));

		
	}

	@Override
	public void updateApplication(Application application) {
		  
		applicationRepository.update((getMapper().map(application, ApplicationEntity.class)));
		
	}

}
