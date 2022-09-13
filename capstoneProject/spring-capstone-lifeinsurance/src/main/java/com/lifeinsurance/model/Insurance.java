package com.lifeinsurance.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Insurance {
	
	@Column(length = 30)
	private String insuranceName;
	
	@Id
	@GeneratedValue(generator = "insurance_gen" , strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "insurance_gen" , sequenceName = "insurance_seq", allocationSize = 1, initialValue = 1)
	private Integer insuranceId;
	
	private double duration;
	
	
	private String plan;
	private double premium;
	
//	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "insurance")
	private List<Client> client;
	
	private double sumAssured;
	
	
	
	public Insurance() {
		super();
	}


	public Insurance(String insuranceName, double duration, String plan, double premium, List<Client> client,
			double sumAssured) {
		super();
		this.insuranceName = insuranceName;
		this.duration = duration;
		this.plan = plan;
		this.premium = premium;
		this.client = client;
		this.sumAssured = sumAssured;
	}

	public String getPlan() {
		return plan;
	}

	public void setPlan(String plan) {
		this.plan = plan;
	}

	public String getInsuranceName() {
		return insuranceName;
	}
	public void setInsuranceName(String insuranceName) {
		this.insuranceName = insuranceName;
	}
	public Integer getInsuranceId() {
		return insuranceId;
	}
	public void setInsuranceId(Integer insuranceId) {
		this.insuranceId = insuranceId;
	}
	public double getDuration() {
		return duration;
	}
	public void setDuration(double duration) {
		this.duration = duration;
	}
	

	public double getPremium() {
		return premium;
	}
	public void setPremium(double premium) {
		this.premium = premium;
	}
	
	public List<Client> getClient() {
		return client;
	}


	public void setClient(List<Client> client) {
		this.client = client;
	}


	public double getSumAssured() {
		return sumAssured;
	}

	public void setSumAssured(double sumAssured) {
		this.sumAssured = sumAssured;
	}
	
	@Override
	public String toString() {
		return "Insurance [insuranceName=" + insuranceName + ", insuranceId=" + insuranceId + ", duration=" + duration
				+ ", plan=" + plan + ", premium=" + premium + ", client=" + client + ", sumAssured=" + sumAssured + "]";
	}



	
	
	
	
	
	

}
