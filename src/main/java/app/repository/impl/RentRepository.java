package app.repository.impl;

import org.springframework.stereotype.Repository;

import app.repository.dao.RentDao;
import app.repository.entity.RentEntity;
import app.repository.hibernate.AbstractHibernateDao;

@Repository
public class RentRepository extends
AbstractHibernateDao<RentEntity, Long> implements RentDao{

}
