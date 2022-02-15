package com.mondee;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="person")

public class Person {
	@Id
	@Column(name="pid")
	private int personId;
	@Column(name="pname")
	private String personName;
	@OneToOne(targetEntity=Voter.class,cascade=CascadeType.ALL)
	private Voter voter;
	public Voter getVoter() {
		return voter;
	}

	public void setVoter(Voter voter) {
		this.voter = voter;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	
	
	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}


	
	

}