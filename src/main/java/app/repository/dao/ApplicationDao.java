package app.repository.dao;

import java.util.Date;
import java.util.List;

import domain.model.Client;
import domain.model.Mechanic;
import domain.model.Sto;
import app.repository.base.GenericDao;
import app.repository.entity.ApplicationEntity;

public interface ApplicationDao extends GenericDao<ApplicationEntity, Long> {
	
	List<ApplicationEntity> findByClient(Client client);
	
	List<ApplicationEntity> findByMechanic(Mechanic mechanic);
	
	List<ApplicationEntity> findByStoToDate(Sto sto,Date dateStart, Date dateFinish);
	
	List<ApplicationEntity> findByMechanicToDate(Mechanic mechanic, Date dateStart, Date dateFinish);
	
	ApplicationEntity getApplicationByID(Long applicationId);

}
