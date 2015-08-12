package app.repository.impl;

import app.repository.dao.DetailDao;
import app.repository.entity.DetailEntity;
import app.repository.hibernate.AbstractHibernateDao;

public class DetailRepository extends
AbstractHibernateDao<DetailEntity, Long> implements DetailDao{

}
