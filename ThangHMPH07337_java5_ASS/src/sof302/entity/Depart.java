package sof302.entity;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name = "Departs")
public class Depart {
	@Id	
	@GeneratedValue
	private Integer id;
	
	@NotBlank(message = "Vui lòng nhập tên phòng !")
	private String name;
	
	@OneToMany(mappedBy = "depart", fetch = FetchType.EAGER)
	private Collection<Staff> staffs;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Collection<Staff> getStaffs(){
		return staffs;
	}
	
	public void setStaffs(Collection<Staff> staffs) {
		this.staffs = staffs;
	}
}
