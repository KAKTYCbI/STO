package app.repository.impl;

import org.springframework.stereotype.Repository;

import app.repository.dao.ServiceDao;
import app.repository.entity.ServiceEntity;
import app.repository.hibernate.AbstractHibernateDao;

@Repository
public class ServiceRepository extends
AbstractHibernateDao<ServiceEntity, Long> implements ServiceDao{

}
