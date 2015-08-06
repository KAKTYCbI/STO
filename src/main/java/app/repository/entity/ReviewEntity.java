package app.repository.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import domain.model.Client;
import domain.model.Mechanic;
import domain.model.Sto;

@Entity
@Table(name="review")
public class ReviewEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="review_id")
	private Long reviewId;
	
	@Column(name="text")
	private String text;
	
	@Column(name="date")
	private Date date;
	
	@Column(name="rating")
	private Float rating;
	
	@Column(name="visible")
	private Boolean visible;
    
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn( name = "client_client_id", nullable = false)
	private Client client;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn( name = "mechanic_mechanic_id", nullable = false)
    private Mechanic mechanic;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn( name = "sto_sto_id", nullable = false)
	private Sto sto;
	
	public Long getReviewId() {
		return reviewId;
	}

	public void setReviewId(Long reviewId) {
		this.reviewId = reviewId;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Float getRating() {
		return rating;
	}

	public void setRating(Float rating) {
		this.rating = rating;
	}

	public Boolean getVisible() {
		return visible;
	}

	public void setVisible(Boolean visible) {
		this.visible = visible;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Mechanic getMechanic() {
		return mechanic;
	}

	public void setMechanic(Mechanic mechanic) {
		this.mechanic = mechanic;
	}

	public Sto getSto() {
		return sto;
	}

	public void setSto(Sto sto) {
		this.sto = sto;
	}
	
	
	
	
}
