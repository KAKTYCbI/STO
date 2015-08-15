package app.service;

import java.util.ArrayList;
import java.util.List;

import org.dozer.DozerBeanMapperSingletonWrapper;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import app.repository.dao.ApplicationDao;
import app.repository.dao.MessageDao;
import app.repository.dao.ReviewDao;
import app.repository.dao.StoDao;
import app.repository.entity.ApplicationEntity;
import app.repository.entity.MessageEntity;
import app.repository.entity.ReviewEntity;
import app.repository.entity.StoEntity;
import domain.model.Application;
import domain.model.Client;
import domain.model.Message;
import domain.model.Review;
import domain.model.Sto;
import domain.service.ClientService;

@Service()
@Transactional
public class ClientServiceImplement implements ClientService{

	@Autowired
	private ApplicationDao applicationRepository;
	
	@Autowired
	private ReviewDao reviewRepository;
	
	@Autowired
	private StoDao stoRepository;
	
	@Autowired
	private MessageDao messageRepository;
	
	
	private Mapper getMapper() {
		return DozerBeanMapperSingletonWrapper.getInstance();
	}
	
	@Override
	public void addOrUpdateApplication(Application application) {
		
		applicationRepository.saveOrUpdate((getMapper().map(application, ApplicationEntity.class)));

	}

	@Override
	public List<Message> getMessageByClient(Client client) {
		
		List<Message> message = new ArrayList<Message>();
		List<MessageEntity> messageEntities = messageRepository.findByClient(client);
		for(MessageEntity MessageEntity : messageEntities) {
			message.add(getMapper().map(MessageEntity, Message.class));
		}
		return message;
		
	}

	@Override
	public void addReview(Review review) {
	
		reviewRepository.save((getMapper().map(review, ReviewEntity.class)));

	}


	@Override
	public List<Sto> getAllSto() {
		List<Sto> sto = new ArrayList<Sto>();
		List<StoEntity> stoEntities = stoRepository.findAll();
		for(StoEntity StoEntity : stoEntities) {
			sto.add(getMapper().map(StoEntity, Sto.class));
		}
		return sto;
	}

	@Override
	public List<Application> getApplication(Client client) {
		List<Application> application = new ArrayList<Application>();
		List<ApplicationEntity> applicationEntities = applicationRepository.findByClient(client);
		for(ApplicationEntity ApplicationEntity : applicationEntities) {
			application.add(getMapper().map(ApplicationEntity, Application.class));
		}
		return application;
	}

}
