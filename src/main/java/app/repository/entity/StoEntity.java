package app.repository.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import domain.model.Application;
import domain.model.Mechanic;
import domain.model.Review;

@Entity
@Table(name="sto")
public class StoEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="sto_id")
	private Long stoId;
	
	@Column(name="name")
	private String name;
	
	@Column(name="rating")
	private Float rating;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "sto", orphanRemoval=true)
	@Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
	private List<Review> reviews;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "sto", orphanRemoval=true)
	@Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<Mechanic> mechanics;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "sto", orphanRemoval=true)
	@Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
	private List<Application> orders;
	
	public Long getStoId() {
		return stoId;
	}

	public void setStoId(Long stoId) {
		this.stoId = stoId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getRating() {
		return rating;
	}

	public void setRating(Float rating) {
		this.rating = rating;
	}

	public List<Review> getReviews() {
		return reviews;
	}

	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}

	public List<Mechanic> getMechanics() {
		return mechanics;
	}

	public void setMechanics(List<Mechanic> mechanics) {
		this.mechanics = mechanics;
	}

	public List<Application> getOrders() {
		return orders;
	}

	public void setOrders(List<Application> orders) {
		this.orders = orders;
	}
	
	

}
