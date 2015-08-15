package app.repository.impl;

import org.springframework.stereotype.Repository;

import app.repository.dao.ReviewDao;
import app.repository.entity.ReviewEntity;
import app.repository.hibernate.AbstractHibernateDao;

@Repository
public class ReviewRepository extends
AbstractHibernateDao<ReviewEntity, Long> implements ReviewDao {

}
