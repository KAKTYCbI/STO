package app.repository.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

import domain.model.Client;
import domain.model.Mechanic;
import app.repository.dao.ApplicationDao;
import app.repository.entity.ApplicationEntity;
import app.repository.entity.MechanicEntity;
import app.repository.hibernate.AbstractHibernateDao;

public class ApplicationRepository extends
AbstractHibernateDao<ApplicationEntity, Long> implements ApplicationDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<ApplicationEntity> findByClient(Client client) {
		Criteria criteria = getSession().createCriteria(ApplicationEntity.class).add(
				Restrictions.eq("client", client));
		return (List<ApplicationEntity>) criteria.list();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<ApplicationEntity> findByMechanic(Mechanic mechanic) {
		Criteria criteria = getSession().createCriteria(MechanicEntity.class).add(
				Restrictions.eq("mechanic", mechanic));
		return (List<ApplicationEntity>) criteria.list();
	}

	@Override
	public ApplicationEntity getApplicationByID(Long applicationId) {
		Criteria cr = getSession().createCriteria(ApplicationEntity.class,
				"users").add(Restrictions.eq("application_id", applicationId));
		return (ApplicationEntity) cr.uniqueResult();
	}

}
