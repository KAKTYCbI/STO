package app.repository.dao;

import java.util.List;

import domain.model.Sto;
import app.repository.base.GenericDao;
import app.repository.entity.MechanicEntity;

public interface MechanicDao extends GenericDao<MechanicEntity, Long> {
	
	List<MechanicEntity> findBySto(Sto sto);

}
