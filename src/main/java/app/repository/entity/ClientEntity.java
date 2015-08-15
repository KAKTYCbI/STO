package app.repository.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;


@Entity
@Table(name = "client")
@PrimaryKeyJoinColumn(name = "user_id")
public class ClientEntity extends UserPrincipalEntity {
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "client", orphanRemoval=true)
	@Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
	private List<MessageEntity> messagesEntity;

	public List<MessageEntity> getMessagesEntity() {
		return messagesEntity;
	}

	public void setMessagesEntity(List<MessageEntity> messagesEntity) {
		this.messagesEntity = messagesEntity;
	}
	



	
	
	
}
