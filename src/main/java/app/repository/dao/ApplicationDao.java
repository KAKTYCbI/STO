package app.repository.dao;

import java.util.List;

import domain.model.Client;
import domain.model.Mechanic;
import app.repository.base.GenericDao;
import app.repository.entity.ApplicationEntity;

public interface ApplicationDao extends GenericDao<ApplicationEntity, Long> {
	
	List<ApplicationEntity> findByClient(Client client);
	
	List<ApplicationEntity> findByMechanic(Mechanic mechanic);
	
	ApplicationEntity getApplicationByID(Long applicationId);

}
