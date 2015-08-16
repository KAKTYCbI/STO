package app.repository.dao;

import java.util.Date;
import java.util.List;

import domain.model.Sto;
import app.repository.base.GenericDao;
import app.repository.entity.RentEntity;

public interface RentDao extends GenericDao<RentEntity, Long>{
	
	 List<RentEntity> findByRentToDate(Sto sto, Date dateStart, Date dateFinish);

}
