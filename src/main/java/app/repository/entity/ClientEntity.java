package app.repository.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import domain.model.Message;

@Entity
@Table(name = "client")
@PrimaryKeyJoinColumn(name = "user_id")
public class ClientEntity extends UserPrincipalEntity {
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "client", orphanRemoval=true)
	@Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
	private List<Message> messages;
	

	public List<Message> getMessages() {
		return messages;
	}

	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}

	
	
	
}
