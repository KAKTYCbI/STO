package app.repository.dao;

import java.util.Date;
import java.util.List;

import domain.model.Director;
import domain.model.Mechanic;
import app.repository.base.GenericDao;
import app.repository.entity.SalaryEntity;

public interface SalaryDao extends GenericDao<SalaryEntity, Long> {

	List<SalaryEntity> findBySalaryToDate(Date dateStart, Date dateFinish);
	
	List<SalaryEntity> findByMechanicSalaryToDate(Mechanic mechanic, Date dateStart, Date dateFinish);
	
	List<SalaryEntity> findByDirectorSalaryToDate(Director director, Date dateStart, Date dateFinish);
}
