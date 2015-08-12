package app.repository.impl;

import app.repository.dao.ServiceDao;
import app.repository.entity.ServiceEntity;
import app.repository.hibernate.AbstractHibernateDao;

public class ServiceRepository extends
AbstractHibernateDao<ServiceEntity, Long> implements ServiceDao{

}
