/**
 * 
 */
package com.home.care.bo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author bhabesh
 *
 */
/**
 * @author bhabesh
 *
 */
@Entity
@Table(name = "rcfe")
public class CityZipData implements Serializable{
	@EmbeddedId
	@Column (name = "FacilityNumber")
	private RcfeFacility facilityNumber;
	@Column(name = "FacilityCity")
	private String facilityCity;
	@Column(name = "FacilityZip")
	private String facilityZip;
	private long facilityCount;
	
	
	public CityZipData(RcfeFacility facilityNumber, String facilityCity, String facilityZip) {
		super();
		this.facilityNumber = facilityNumber;
		this.facilityCity = facilityCity;
		this.facilityZip = facilityZip;
	}
	
	public CityZipData(long facilityCount, String facilityCity, String facilityZip) {
		super();
		this.facilityCount = facilityCount;
		this.facilityCity = facilityCity;
		this.facilityZip = facilityZip;
	}
	
	
	/**
	 * @param facilityCity
	 * @param facilityZip
	 */
	public CityZipData(String facilityCity, String facilityZip) {
		super();
		this.facilityCity = facilityCity;
		this.facilityZip = facilityZip;
	}

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
	/**
	 * @return the facilityCity
	 */
	public String getFacilityCity() {
		return facilityCity;
	}
	/**
	 * @param facilityCity the facilityCity to set
	 */
	public void setFacilityCity(String facilityCity) {
		this.facilityCity = facilityCity;
	}
	/**
	 * @return the facilityZip
	 */
	public String getFacilityZip() {
		return facilityZip;
	}
	/**
	 * @param facilityZip the facilityZip to set
	 */
	public void setFacilityZip(String facilityZip) {
		this.facilityZip = facilityZip;
	}

	/**
	 * @return the facilityCount
	 */
	public long getFacilityCount() {
		return facilityCount;
	}

	/**
	 * @param facilityCount the facilityCount to set
	 */
	public void setFacilityCount(long facilityCount) {
		this.facilityCount = facilityCount;
	}
	
	
}
