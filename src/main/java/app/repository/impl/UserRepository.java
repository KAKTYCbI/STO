package app.repository.impl;

import org.springframework.stereotype.Repository;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

import app.repository.dao.UserDao;
import app.repository.entity.UserPrincipalEntity;
import app.repository.hibernate.AbstractHibernateDao;



@Repository
public class UserRepository extends
		AbstractHibernateDao<UserPrincipalEntity, Long> implements UserDao {
	

	public UserPrincipalEntity getUser(String login, String password) {
		Criteria cr = getSession()
				.createCriteria(UserPrincipalEntity.class, "users")
				.add(Restrictions.eq("login", login))
				.add(Restrictions.eq("password", password));
		return (UserPrincipalEntity) cr.uniqueResult();
	}

	@Override
	public UserPrincipalEntity getUserByName(String name) {
		Criteria cr = getSession().createCriteria(UserPrincipalEntity.class,
				"users").add(Restrictions.eq("name", name));
		return (UserPrincipalEntity) cr.uniqueResult();
	}

	@Override
	public UserPrincipalEntity getUserByID(Long userId) {
		Criteria cr = getSession().createCriteria(UserPrincipalEntity.class,
				"users").add(Restrictions.eq("user_id", userId));
		return (UserPrincipalEntity) cr.uniqueResult();
	}

}
