package app.repository.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import domain.model.Mechanic;
import app.repository.dao.ApplicationDetailDao;
import app.repository.entity.ApplicationDetailEntity;
import app.repository.entity.MechanicEntity;
import app.repository.hibernate.AbstractHibernateDao;

@Repository
public class ApplicationDetailRepository extends
AbstractHibernateDao<ApplicationDetailEntity, Long> implements ApplicationDetailDao{
	@SuppressWarnings("unchecked")
	@Override
	public List<ApplicationDetailEntity> findByMechanic(Mechanic mechanic) {
		Criteria criteria = getSession().createCriteria(MechanicEntity.class).add(
				Restrictions.eq("mechanic", mechanic));
		return (List<ApplicationDetailEntity>) criteria.list();
	}


}
