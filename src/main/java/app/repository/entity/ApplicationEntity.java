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
	private StatusEntity statusEntity;
	
	@ManyToMany(fetch = FetchType.LAZY/*, cascade = CascadeType.ALL*/)
	@JoinTable(name = "service_has_application", 
			joinColumns = { 
				@JoinColumn(name = "application_application_id", nullable = false) }, 
				inverseJoinColumns = { @JoinColumn(name = "service_service_id", nullable = false) })
	@Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
	private List<ServiceEntity> servicesEntity;
	
	@ManyToMany(fetch = FetchType.LAZY/*, cascade = CascadeType.ALL*/)
	@JoinTable(name = "application_has_detail", 
			joinColumns = { 
				@JoinColumn(name = "application_application_id", nullable = false) }, 
				inverseJoinColumns = { @JoinColumn(name = "detail_detail_id", nullable = false) })
	@Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
	private List<DetailEntity> detailsEntity;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn( name = "client_client_id", nullable = false)
	private ClientEntity clientEntity;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn( name = "mechanic_mechanic_id", nullable = false)
	private MechanicEntity mechanicEntity;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn( name = "sto_sto_id", nullable = false)
	private StoEntity stoEntity;
	
   

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

	public StatusEntity getStatusEntity() {
		return statusEntity;
	}

	public void setStatusEntity(StatusEntity statusEntity) {
		this.statusEntity = statusEntity;
	}

	public List<ServiceEntity> getServicesEntity() {
		return servicesEntity;
	}

	public void setServicesEntity(List<ServiceEntity> servicesEntity) {
		this.servicesEntity = servicesEntity;
	}

	public List<DetailEntity> getDetailsEntity() {
		return detailsEntity;
	}

	public void setDetailsEntity(List<DetailEntity> detailsEntity) {
		this.detailsEntity = detailsEntity;
	}

	public ClientEntity getClientEntity() {
		return clientEntity;
	}

	public void setClientEntity(ClientEntity clientEntity) {
		this.clientEntity = clientEntity;
	}

	public MechanicEntity getMechanicEntity() {
		return mechanicEntity;
	}

	public void setMechanicEntity(MechanicEntity mechanicEntity) {
		this.mechanicEntity = mechanicEntity;
	}

	public StoEntity getStoEntity() {
		return stoEntity;
	}

	public void setStoEntity(StoEntity stoEntity) {
		this.stoEntity = stoEntity;
	}



	
}
