package app.repository.dao;

import app.repository.base.GenericDao;
import app.repository.entity.UserPrincipalEntity;

public interface UserDao extends GenericDao<UserPrincipalEntity, Long> {

	UserPrincipalEntity getUser(String login, String password);

	UserPrincipalEntity getUserByID(Long userId);

	UserPrincipalEntity getUserByName(String name);

}
