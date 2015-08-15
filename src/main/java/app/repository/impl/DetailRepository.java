package app.repository.impl;

import org.springframework.stereotype.Repository;

import app.repository.dao.DetailDao;
import app.repository.entity.DetailEntity;
import app.repository.hibernate.AbstractHibernateDao;

@Repository
public class DetailRepository extends
AbstractHibernateDao<DetailEntity, Long> implements DetailDao{

}
