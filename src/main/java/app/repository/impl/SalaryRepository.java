package app.repository.impl;

import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;




import domain.model.Director;
import domain.model.Mechanic;
import app.repository.dao.SalaryDao;
import app.repository.entity.SalaryEntity;
import app.repository.hibernate.AbstractHibernateDao;

public class SalaryRepository extends
AbstractHibernateDao<SalaryEntity, Long> implements SalaryDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<SalaryEntity> findBySalaryToDate(Date dateStart, Date dateFinish) {
		Criteria criteria = getSession().createCriteria(SalaryEntity.class).add(
				Restrictions.between("date", dateStart, dateFinish));
		return (List<SalaryEntity>) criteria.list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<SalaryEntity> findByMechanicSalaryToDate(Mechanic mechanic,
			Date dateStart, Date dateFinish) {
		Criteria criteria = getSession().createCriteria(SalaryEntity.class).add(
				Restrictions.eq("mechanic", mechanic)).add(
				Restrictions.between("date", dateStart, dateFinish));
		return (List<SalaryEntity>) criteria.list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<SalaryEntity> findByDirectorSalaryToDate(Director director,
			Date dateStart, Date dateFinish) {
		Criteria criteria = getSession().createCriteria(SalaryEntity.class).add(
				Restrictions.eq("director", director)).add(
				Restrictions.between("date", dateStart, dateFinish));
		return (List<SalaryEntity>) criteria.list();
	}

}
