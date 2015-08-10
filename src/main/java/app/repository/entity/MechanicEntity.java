package app.repository.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import domain.model.Message;
import domain.model.Review;
import domain.model.Salary;
import domain.model.Sto;

@Entity
@Table(name="mechanic")
@PrimaryKeyJoinColumn(name = "user_id")
public class MechanicEntity extends UserPrincipalEntity{
	
	@Column(name="rating")
	private Float rating;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "mechanic", orphanRemoval=true)
	@Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
	private List<Message> messages;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "mechanic", orphanRemoval=true)
	@Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
	private List<Salary> salarys;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "mechanic", orphanRemoval=true)
	@Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
	private List<Review> reviews;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn( name = "sto_id", nullable = false)
	private Sto sto;
	
	public Float getRating() {
		return rating;
	}

	public void setRating(Float rating) {
		this.rating = rating;
	}

	public List<Message> getMessages() {
		return messages;
	}

	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}

	public List<Salary> getSalarys() {
		return salarys;
	}

	public void setSalarys(List<Salary> salarys) {
		this.salarys = salarys;
	}

	public List<Review> getReviews() {
		return reviews;
	}

	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}

	public Sto getSto() {
		return sto;
	}

	public void setSto(Sto sto) {
		this.sto = sto;
	}

	
	
}
