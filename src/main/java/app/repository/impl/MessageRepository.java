package app.repository.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import domain.model.Client;
import app.repository.dao.MessageDao;
import app.repository.entity.MessageEntity;
import app.repository.hibernate.AbstractHibernateDao;

@Repository
public class MessageRepository extends
AbstractHibernateDao<MessageEntity, Long> implements MessageDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<MessageEntity> findByClient(Client client) {
		Criteria criteria = getSession().createCriteria(MessageEntity.class).add(
				Restrictions.eq("client", client));
		return (List<MessageEntity>) criteria.list();
	}

}
