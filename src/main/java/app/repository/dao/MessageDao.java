package app.repository.dao;

import java.util.List;

import domain.model.Client;
import app.repository.base.GenericDao;
import app.repository.entity.MessageEntity;

public interface MessageDao extends GenericDao<MessageEntity, Long>{

	List<MessageEntity> findByClient(Client client);
}
