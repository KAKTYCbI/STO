package app.repository.impl;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import app.repository.dao.StoDao;
import app.repository.entity.StoEntity;
import app.repository.hibernate.AbstractHibernateDao;

@Repository
public class StoRepository extends
AbstractHibernateDao<StoEntity, Long> implements StoDao{

	@Override
	public StoEntity findByName(String name) {
		Criteria cr = getSession().createCriteria(StoEntity.class,
				"sto").add(Restrictions.eq("name", name));
		return (StoEntity) cr.uniqueResult();
	
	}


}
