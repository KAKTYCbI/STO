package app.repository.impl;

import app.repository.dao.ApplicationDetailDao;
import app.repository.entity.ApplicationDetailEntity;
import app.repository.hibernate.AbstractHibernateDao;

public class ApplicationDetailRepository extends
AbstractHibernateDao<ApplicationDetailEntity, Long> implements ApplicationDetailDao{



}
