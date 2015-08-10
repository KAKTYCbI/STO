package app.repository.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import domain.model.Salary;

@Entity
@Table(name="director")
@PrimaryKeyJoinColumn(name = "user_id")
public class DirectorEntity extends UserPrincipalEntity {

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "director", orphanRemoval=true)
	@Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
	private List<Salary> salarys;
	

	public List<Salary> getSalarys() {
		return salarys;
	}

	public void setSalarys(List<Salary> salarys) {
		this.salarys = salarys;
	}
	
	

}
