package app.repository.impl;

import app.repository.dao.StoDao;
import app.repository.entity.StoEntity;
import app.repository.hibernate.AbstractHibernateDao;

public class StoRepository extends
AbstractHibernateDao<StoEntity, Long> implements StoDao{

}
