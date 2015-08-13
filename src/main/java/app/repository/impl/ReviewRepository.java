package app.repository.impl;

import app.repository.dao.ReviewDao;
import app.repository.entity.ReviewEntity;
import app.repository.hibernate.AbstractHibernateDao;

public class ReviewRepository extends
AbstractHibernateDao<ReviewEntity, Long> implements ReviewDao {

}
