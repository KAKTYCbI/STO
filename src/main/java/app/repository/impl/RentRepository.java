package app.repository.impl;

import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import domain.model.Sto;
import app.repository.dao.RentDao;
import app.repository.entity.RentEntity;
import app.repository.hibernate.AbstractHibernateDao;

@Repository
public class RentRepository extends
AbstractHibernateDao<RentEntity, Long> implements RentDao{
	
	@SuppressWarnings("unchecked")
	@Override
	public List<RentEntity> findByRentToDate(Sto sto, Date dateStart, Date dateFinish)
	{
		Criteria criteria = getSession().createCriteria(RentEntity.class).add(
				Restrictions.eq("sto", sto)).add(
				Restrictions.between("start", dateStart, dateFinish));
		return (List<RentEntity>) criteria.list();
	}

}
