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
    private DirectorEntity director;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn( name = "mechanic_id", nullable = false)
	private MechanicEntity mechanic;
	
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

	public DirectorEntity getDirector() {
		return director;
	}

	public void setDirector(DirectorEntity director) {
		this.director = director;
	}

	public MechanicEntity getMechanic() {
		return mechanic;
	}

	public void setMechanic(MechanicEntity mechanic) {
		this.mechanic = mechanic;
	}


	
	
}
