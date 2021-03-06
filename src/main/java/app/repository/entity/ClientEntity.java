package app.repository.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.dozer.Mapping;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;


@Entity
@Table(name = "client")
@PrimaryKeyJoinColumn(name = "user_id")
public class ClientEntity extends UserPrincipalEntity {
	
	@Mapping("messages")
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "client", orphanRemoval=true)
	@Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
	private List<MessageEntity> messages;

	public List<MessageEntity> getMessages() {
		return messages;
	}

	public void setMessages(List<MessageEntity> messages) {
		this.messages = messages;
	}


	



	
	
	
}
