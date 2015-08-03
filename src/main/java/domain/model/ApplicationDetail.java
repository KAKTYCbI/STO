package domain.model;

import java.util.Date;

public class ApplicationDetail {
	
	private Long id;
	
	private Status status;
	
	private String name;
	
	private Date dateOrder;
	
	private Date dateDelivery;
	
	private Application application;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}



	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
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

	public Application getApplication() {
		return application;
	}

	public void setApplication(Application application) {
		this.application = application;
	}
	
	

}
