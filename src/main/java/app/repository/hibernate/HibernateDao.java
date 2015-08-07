package app.repository.hibernate;

import java.io.Serializable;
import java.util.List;

import org.hibernate.criterion.Criterion;

import app.repository.base.GenericDao;

public interface HibernateDao<T, PK extends Serializable> extends GenericDao<T, PK> {
	
	List<T> findByCriteria(Criterion criterion);

}
