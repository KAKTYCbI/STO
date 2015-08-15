package app.service;

import java.util.ArrayList;
import java.util.List;

import org.dozer.DozerBeanMapperSingletonWrapper;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import app.repository.dao.ApplicationDao;
import app.repository.dao.ApplicationDetailDao;
import app.repository.dao.MessageDao;
import app.repository.entity.ApplicationDetailEntity;
import app.repository.entity.ApplicationEntity;
import app.repository.entity.MessageEntity;
import app.repository.entity.map.ModelClassMap;
import domain.model.Application;
import domain.model.ApplicationDetail;
import domain.model.Mechanic;
import domain.model.Message;
import domain.service.MechanicService;

@Service()
@Transactional
public class MechanicServiceImplement implements MechanicService{

	@Autowired
	private ApplicationDao applicationRepository;
	
	@Autowired
	private MessageDao messageRepository;
	
	@Autowired
	private ApplicationDetailDao applicationDetailRepository;
	
	@Autowired
	private ModelClassMap modelClassMap;
	
	private Mapper getMapper() {
		return DozerBeanMapperSingletonWrapper.getInstance();
	}
	
	@Override
	public List<Application> getCurrentApplication(Mechanic mechanic) {
	 
		List<Application> application = new ArrayList<Application>();
		List<ApplicationEntity> applicationEntities = applicationRepository.findByMechanic(mechanic);
		for(ApplicationEntity ApplicationEntity : applicationEntities) {
			application.add(getMapper().map(ApplicationEntity, Application.class));
		}
		return application;
	}

	@Override
	public List<ApplicationDetail> getAllApplicationDetail(Mechanic mechanic) {
		List<ApplicationDetail> applicationDetail = new ArrayList<ApplicationDetail>();
		List<ApplicationDetailEntity> applicationDetailEntities = applicationDetailRepository.findByMechanic(mechanic);
		for(ApplicationDetailEntity ApplicationDetailEntity : applicationDetailEntities) {
			applicationDetail.add(getMapper().map(ApplicationDetailEntity, ApplicationDetail.class));
		}
		return applicationDetail;
	}

	@Override
	public void updateApplication(Application application) {
		applicationRepository.update((getMapper().map(application, ApplicationEntity.class)));
	
	}

	@Override
	public Application getApplicationById(Long Id) {
		ApplicationEntity applicationEntity = applicationRepository.getApplicationByID(Id);
		Application applicationModel = null;
		if (applicationEntity != null) {
			applicationModel = (Application) getMapper().map(applicationEntity,
					modelClassMap.getModelClass(applicationEntity.getClass()));
		}
		return applicationModel;
	}

	@Override
	public void orderDetail(ApplicationDetail applicationDetail) {

		applicationDetailRepository.save((getMapper().map(applicationDetail, ApplicationDetailEntity.class)));

	}

	@Override
	public void notification(Message message) {
		messageRepository.save((getMapper().map(message, MessageEntity.class)));

		
	}

}
