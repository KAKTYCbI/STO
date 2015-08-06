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

import domain.model.Director;
import domain.model.Mechanic;


@Entity
@Table(name="salary")
public class SalaryEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="salary_id")
	private Long salaryId;
	
	@Column(name="date")
	private Date date;
	
	@Column(name="summa")
	private Float summa;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn( name = "director_id", nullable = false)
    private Director director;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn( name = "mechanic_id", nullable = false)
	private Mechanic mechanic;
	
	public Long getSalaryId() {
		return salaryId;
	}

	public void setSalaryId(Long salaryId) {
		this.salaryId = salaryId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Float getSumma() {
		return summa;
	}

	public void setSumma(Float summa) {
		this.summa = summa;
	}

	public Director getDirector() {
		return director;
	}

	public void setDirector(Director director) {
		this.director = director;
	}

	public Mechanic getMechanic() {
		return mechanic;
	}

	public void setMechanic(Mechanic mechanic) {
		this.mechanic = mechanic;
	}
	
	
}
