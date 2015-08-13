package app.repository.dao;

import java.util.List;

import domain.model.Mechanic;
import app.repository.base.GenericDao;
import app.repository.entity.ApplicationDetailEntity;



public interface ApplicationDetailDao extends GenericDao<ApplicationDetailEntity, Long>{
	
	List<ApplicationDetailEntity> findByMechanic(Mechanic mechanic);
}
