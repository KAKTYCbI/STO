package app.repository.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import domain.model.Client;
import domain.model.Detail;
import domain.model.Mechanic;
import domain.model.Service;
import domain.model.Status;
import domain.model.Sto;

@Entity
@Table(name = "application")
public class ApplicationEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="application_id")
    private Long id;
	
	@Column(name="price")
	private Float price;
	
	@Column(name="date_order")
	private Date dateOrder;
	
	@Column(name="date_completion")
	private Date dateCompletion;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn( name = "status_status_id", nullable = false)
	private Status status;
	
	@ManyToMany(fetch = FetchType.LAZY/*, cascade = CascadeType.ALL*/)
	@JoinTable(name = "service_has_application", 
			joinColumns = { 
				@JoinColumn(name = "application_application_id", nullable = false) }, 
				inverseJoinColumns = { @JoinColumn(name = "service_service_id", nullable = false) })
	@Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
	private List<Service> services;
	
	@ManyToMany(fetch = FetchType.LAZY/*, cascade = CascadeType.ALL*/)
	@JoinTable(name = "application_has_detail", 
			joinColumns = { 
				@JoinColumn(name = "application_application_id", nullable = false) }, 
				inverseJoinColumns = { @JoinColumn(name = "detail_detail_id", nullable = false) })
	@Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
	private List<Detail> details;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn( name = "client_client_id", nullable = false)
	private Client client;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn( name = "mechanic_mechanic_id", nullable = false)
	private Mechanic mechanic;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn( name = "sto_sto_id", nullable = false)
	private Sto sto;
	
   

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Date getDateOrder() {
		return dateOrder;
	}

	public void setDateOrder(Date dateOrder) {
		this.dateOrder = dateOrder;
	}

	public Date getDateCompletion() {
		return dateCompletion;
	}

	public void setDateCompletion(Date dateCompletion) {
		this.dateCompletion = dateCompletion;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public List<Service> getServices() {
		return services;
	}

	public void setServices(List<Service> services) {
		this.services = services;
	}

	public List<Detail> getDetails() {
		return details;
	}

	public void setDetails(List<Detail> details) {
		this.details = details;
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
