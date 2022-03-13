package com.home.care.bo;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class RcfeFacility implements Serializable{
	private Long facilityNumber;

	/**
	 * @return the facilityNumber
	 */
	public Long getFacilityNumber() {
		return facilityNumber;
	}

	/**
	 * @param facilityNumber the facilityNumber to set
	 */
	public void setFacilityNumber(Long facilityNumber) {
		this.facilityNumber = facilityNumber;
	}
	
}
