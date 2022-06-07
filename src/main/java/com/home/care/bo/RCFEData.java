/**
 * Project				:	prjHomeCareServ
  * 
 * Author				:	Bhabesh
 * E-mail               :   bhabesh.m@gmail.com
 *
 * FrameWork			:	Spring boot 2.6 
 * 
 * File Name			:	RCFEData.java
 * Package Name			:	com.home.care.bo
 * Date of creation		:	Feb. 14, 2022  1:51:39 a.m.
 * Date of modification :	
 * 
 * Summary				:	
 *
 *
 * Copyright 2022 the original author or authors and Organization.
 *
 * Licensed under the MIT
 * you may not use this file except in compliance with the License.
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * 
 */
package com.home.care.bo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author bhabesh
 *
 */
@Entity
@Table(name = "rcfe")
public class RCFEData implements Serializable {
	// @Id
	// @GeneratedValue(strategy = GenerationType.IDENTITY)
	// @Id
	// @GeneratedValue
	// private int Id;
	@EmbeddedId
	@Column(name = "FacilityNumber")
	private RcfeFacility facilityNumber;
	@Column(name = "facilityName")
	private String facilityName;
	@Column(name = "Licensee")
	private String licensee;
	@Column(name = "FacilityAdministrator")
	private String facilityAdministrator;
	@Column(name = "FacilityTelephoneNumber")
	private String facilityTelephoneNumber;
	@Column(name = "FacilityAddress")
	private String facilityAddress;
	@Column(name = "FacilityCity")
	private String facilityCity;
	@Column(name = "FacilityState")
	private String facilityState;
	@Column(name = "FacilityZip")
	private String facilityZip;
	@Column(name = "CountyName")
	private String countyName;
	@Column(name = "RegionalOffice")
	private String regionalOffice;
	@Column(name = "FacilityCapacity")
	private String facilityCapacity;
	@Column(name = "FacilityStatus")
	private String facilityStatus;
	@Column(name = "LicenseFirstDate")
	private String licenseFirstDate;
	@Column(name = "ClosedDate")
	private String closedDate;
	@Column(name = "LastVisitDate")
	private String lastVisitDate;
	@Column(name = "InspectionVisits")
	private String inspectionVisits;
	@Column(name = "ComplaintVisits")
	private String complaintVisits;
	@Column(name = "OtherVisits")
	private String otherVisits;
	@Column(name = "TotalVisits")
	private String totalVisits;
	
	  @Column(name = "CitationNumbers") 
	  private String citationNumbers;
	 
	@Column(name = "POCDates")
	private String pocDates;
	
	 @Column(name = "AllVisitDates")
	  private String allVisitDates;
	 
	@Column(name = "InspectionVisitDates")
	private String inspectionVisitDates;
	@Column(name = "InspectTypeA")
	private String inspectTypeA;
	@Column(name = "InspectTypeB")
	private String inspectTypeB;
	
	@Column(name = "OtherVisitDates") 
	private String otherVisitDates;
	 
	@Column(name = "OtherTypeA")
	private String otherTypeA;
	@Column(name = "OtherTypeB")
	private String otherTypeB;
	@Column(name = "ComplaintTypeA")
	private String complaintTypeA;
	@Column(name = "ComplaintTypeB")
	private String complaintTypeB;
	@Column(name = "TotalAllegations")
	private String totalAllegations;
	@Column(name = "InconclusiveAllegations")
	private String inconclusiveAllegations;
	@Column(name = "SubstantiatedAllegations")
	private String substantiatedAllegations;
	@Column(name = "UnsubstantiatedAllegations")
	private String unsubstantiatedAllegations;
	@Column(name = "UnfoundedAllegations")
	private String unfoundedAllegations;
	/*
	 * @Column(name = "") private String complaintInfoDate;
	 * 
	 * @Column(name = "") private String subA;
	 * 
	 * @Column(name = "") private String incA;
	 * 
	 * @Column(name = "") private String unsA;
	 * 
	 * @Column(name = "") private String unfA;
	 * 
	 * @Column(name = "") private String typeA;
	 * 
	 * @Column(name = "") private String typeB;
	 */
	/**
	 * @return the id
	 */
	/*
	 * public int getId() { return Id; }
	 *//**
		 * @param id the id to set
		 *//*
			 * public void setId(int id) { Id = id; }
			 */

	/**
	 * @return the facilityNumber
	 */
	public RcfeFacility getFacilityNumber() {
		return facilityNumber;
	}

	/**
	 * @param facilityNumber the facilityNumber to set
	 */
	public void setFacilityNumber(RcfeFacility facilityNumber) {
		this.facilityNumber = facilityNumber;
	}

	public String getFacilityName() {
		return facilityName;
	}

	public void setFacilityName(String facilityName) {
		this.facilityName = facilityName;
	}

	public String getLicensee() {
		return licensee;
	}

	public void setLicensee(String licensee) {
		this.licensee = licensee;
	}

	public String getFacilityAdministrator() {
		return facilityAdministrator;
	}

	public void setFacilityAdministrator(String facilityAdministrator) {
		this.facilityAdministrator = facilityAdministrator;
	}

	public String getFacilityTelephoneNumber() {
		return facilityTelephoneNumber;
	}

	public void setFacilityTelephoneNumber(String facilityTelephoneNumber) {
		this.facilityTelephoneNumber = facilityTelephoneNumber;
	}

	public String getFacilityAddress() {
		return facilityAddress;
	}

	public void setFacilityAddress(String facilityAddress) {
		this.facilityAddress = facilityAddress;
	}

	public String getFacilityCity() {
		return facilityCity;
	}

	public void setFacilityCity(String facilityCity) {
		this.facilityCity = facilityCity;
	}

	public String getFacilityState() {
		return facilityState;
	}

	public void setFacilityState(String facilityState) {
		this.facilityState = facilityState;
	}

	public String getFacilityZip() {
		return facilityZip;
	}

	public void setFacilityZip(String facilityZip) {
		this.facilityZip = facilityZip;
	}

	public String getCountyName() {
		return countyName;
	}

	public void setCountyName(String countyName) {
		this.countyName = countyName;
	}

	public String getRegionalOffice() {
		return regionalOffice;
	}

	public void setRegionalOffice(String regionalOffice) {
		this.regionalOffice = regionalOffice;
	}

	public String getFacilityCapacity() {
		return facilityCapacity;
	}

	public void setFacilityCapacity(String facilityCapacity) {
		this.facilityCapacity = facilityCapacity;
	}

	public String getFacilityStatus() {
		return facilityStatus;
	}

	public void setFacilityStatus(String facilityStatus) {
		this.facilityStatus = facilityStatus;
	}

	public String getLicenseFirstDate() {
		return licenseFirstDate;
	}

	public void setLicenseFirstDate(String licenseFirstDate) {
		this.licenseFirstDate = licenseFirstDate;
	}

	public String getClosedDate() {
		return closedDate;
	}

	public void setClosedDate(String closedDate) {
		this.closedDate = closedDate;
	}

	public String getLastVisitDate() {
		return lastVisitDate;
	}

	public void setLastVisitDate(String lastVisitDate) {
		this.lastVisitDate = lastVisitDate;
	}

	public String getInspectionVisits() {
		return inspectionVisits;
	}

	public void setInspectionVisits(String inspectionVisits) {
		this.inspectionVisits = inspectionVisits;
	}

	public String getComplaintVisits() {
		return complaintVisits;
	}

	public void setComplaintVisits(String complaintVisits) {
		this.complaintVisits = complaintVisits;
	}

	public String getOtherVisits() {
		return otherVisits;
	}

	public void setOtherVisits(String otherVisits) {
		this.otherVisits = otherVisits;
	}

	public String getTotalVisits() {
		return totalVisits;
	}

	public void setTotalVisits(String totalVisits) {
		this.totalVisits = totalVisits;
	}

	
	  public String getCitationNumbers() { 
		  return citationNumbers; 
	  } 
	  
	  public void  setCitationNumbers(String citationNumbers) { 
		  this.citationNumbers = citationNumbers; 
	  }
	 
	public String getPocDates() {
		return pocDates;
	}

	public void setPocDates(String pocDates) {
		this.pocDates = pocDates;
	}

	
	  public String getAllVisitDates() { 
		  return allVisitDates; 
	  } 
	  public void setAllVisitDates(String allVisitDates) { 
		  this.allVisitDates = allVisitDates;
	  }
	 
	public String getInspectionVisitDates() {
		return inspectionVisitDates;
	}

	public void setInspectionVisitDates(String inspectionVisitDates) {
		this.inspectionVisitDates = inspectionVisitDates;
	}

	public String getInspectTypeA() {
		return inspectTypeA;
	}

	public void setInspectTypeA(String inspectTypeA) {
		this.inspectTypeA = inspectTypeA;
	}

	public String getInspectTypeB() {
		return inspectTypeB;
	}

	public void setInspectTypeB(String inspectTypeB) {
		this.inspectTypeB = inspectTypeB;
	}

	
	public String getOtherVisitDates() { 
		  return otherVisitDates; 
	} 
	public void setOtherVisitDates(String otherVisitDates) { 
		this.otherVisitDates = otherVisitDates; 
	}
	 
	public String getOtherTypeA() {
		return otherTypeA;
	}

	public void setOtherTypeA(String otherTypeA) {
		this.otherTypeA = otherTypeA;
	}

	public String getOtherTypeB() {
		return otherTypeB;
	}

	public void setOtherTypeB(String otherTypeB) {
		this.otherTypeB = otherTypeB;
	}

	public String getComplaintTypeA() {
		return complaintTypeA;
	}

	public void setComplaintTypeA(String complaintTypeA) {
		this.complaintTypeA = complaintTypeA;
	}

	public String getComplaintTypeB() {
		return complaintTypeB;
	}

	public void setComplaintTypeB(String complaintTypeB) {
		this.complaintTypeB = complaintTypeB;
	}

	public String getTotalAllegations() {
		return totalAllegations;
	}

	public void setTotalAllegations(String totalAllegations) {
		this.totalAllegations = totalAllegations;
	}

	public String getInconclusiveAllegations() {
		return inconclusiveAllegations;
	}

	public void setInconclusiveAllegations(String inconclusiveAllegations) {
		this.inconclusiveAllegations = inconclusiveAllegations;
	}

	public String getSubstantiatedAllegations() {
		return substantiatedAllegations;
	}

	public void setSubstantiatedAllegations(String substantiatedAllegations) {
		this.substantiatedAllegations = substantiatedAllegations;
	}

	public String getUnsubstantiatedAllegations() {
		return unsubstantiatedAllegations;
	}

	public void setUnsubstantiatedAllegations(String unsubstantiatedAllegations) {
		this.unsubstantiatedAllegations = unsubstantiatedAllegations;
	}

	public String getUnfoundedAllegations() {
		return unfoundedAllegations;
	}

	public void setUnfoundedAllegations(String unfoundedAllegations) {
		this.unfoundedAllegations = unfoundedAllegations;
	}
	/*
	 * public String getComplaintInfoDate() { return complaintInfoDate; } public
	 * void setComplaintInfoDate(String complaintInfoDate) { this.complaintInfoDate
	 * = complaintInfoDate; } public String getSubA() { return subA; } public void
	 * setSubA(String subA) { this.subA = subA; } public String getIncA() { return
	 * incA; } public void setIncA(String incA) { this.incA = incA; } public String
	 * getUnsA() { return unsA; } public void setUnsA(String unsA) { this.unsA =
	 * unsA; } public String getUnfA() { return unfA; } public void setUnfA(String
	 * unfA) { this.unfA = unfA; } public String getTypeA() { return typeA; } public
	 * void setTypeA(String typeA) { this.typeA = typeA; } public String getTypeB()
	 * { return typeB; } public void setTypeB(String typeB) { this.typeB = typeB; }
	 */

}
