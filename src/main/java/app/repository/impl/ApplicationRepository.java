package app.repository.impl;

import app.repository.dao.ApplicationDao;
import app.repository.entity.ApplicationEntity;
import app.repository.hibernate.AbstractHibernateDao;

public class ApplicationRepository extends
AbstractHibernateDao<ApplicationEntity, Long> implements ApplicationDao{

}
