package app.repository.impl;


import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;


import org.springframework.stereotype.Repository;

import domain.model.Sto;
import app.repository.dao.MechanicDao;
import app.repository.entity.MechanicEntity;
import app.repository.hibernate.AbstractHibernateDao;

@Repository
public class MechanicRepository extends
AbstractHibernateDao<MechanicEntity, Long> implements MechanicDao{

	@SuppressWarnings("unchecked")
	@Override
	public List <MechanicEntity> findBySto(Sto sto) {
		Criteria criteria = getSession().createCriteria(MechanicEntity.class).add(
				Restrictions.eq("sto", sto));
		return (List<MechanicEntity>) criteria.list();
	}
	
	
	
	
	

}
