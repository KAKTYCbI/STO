package app.repository.impl;

import app.repository.dao.MechanicDao;
import app.repository.entity.MechanicEntity;
import app.repository.hibernate.AbstractHibernateDao;

public class MechanicRepository extends
AbstractHibernateDao<MechanicEntity, Long> implements MechanicDao{

}
