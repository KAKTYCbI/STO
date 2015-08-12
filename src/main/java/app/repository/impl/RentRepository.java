package app.repository.impl;

import app.repository.dao.RentDao;
import app.repository.entity.RentEntity;
import app.repository.hibernate.AbstractHibernateDao;

public class RentRepository extends
AbstractHibernateDao<RentEntity, Long> implements RentDao{

}
