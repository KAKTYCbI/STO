package app.repository.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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
	private Double rating;

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

	public Double getRating() {
		return rating;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}
	
	

}
