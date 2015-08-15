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
@Table
public class ApplicationDetailEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="application_detail_id")
    private Long applicationDetailId;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn( name = "status_status_id", nullable = false)
	private StatusEntity status;
	
	@Column(name="name")
	private String name;
	
	@Column(name="date_order")
	private Date dateOrder;
	
	@Column(name="date_delivery")
	private Date dateDelivery;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn( name = "application_application_id", nullable = false)
	private ApplicationEntity applicationEntity;

	public Long getApplicationDetailId() {
		return applicationDetailId;
	}

	public void setApplicationDetailId(Long applicationDetailId) {
		this.applicationDetailId = applicationDetailId;
	}


	public StatusEntity getStatus() {
		return status;
	}

	public void setStatus(StatusEntity status) {
		this.status = status;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDateOrder() {
		return dateOrder;
	}

	public void setDateOrder(Date dateOrder) {
		this.dateOrder = dateOrder;
	}

	public Date getDateDelivery() {
		return dateDelivery;
	}

	public void setDateDelivery(Date dateDelivery) {
		this.dateDelivery = dateDelivery;
	}

	public ApplicationEntity getApplicationEntity() {
		return applicationEntity;
	}

	public void setApplicationEntity(ApplicationEntity applicationEntity) {
		this.applicationEntity = applicationEntity;
	}


	
}
