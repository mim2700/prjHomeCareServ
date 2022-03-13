package com.home.care.bo;

import com.opencsv.bean.CsvBindByPosition;

public class RCFECsv {

	@CsvBindByPosition(position = 1)
	private String facilityNumber;
	@CsvBindByPosition(position = 2)
	private String facilityName;
	@CsvBindByPosition(position = 3)
	private String licensee;
	@CsvBindByPosition(position = 4)
	private String facilityAdministrator;
	@CsvBindByPosition(position = 5)
	private String facilityTelephoneNumber;
	@CsvBindByPosition(position = 6)
	private String facilityAddress;
	@CsvBindByPosition(position = 7)
	private String facilityCity;
	@CsvBindByPosition(position = 8)
	private String facilityState;
	@CsvBindByPosition(position = 9)
	private String facilityZip;
	@CsvBindByPosition(position = 10)
	private String countyName;
	@CsvBindByPosition(position = 11)
	private String regionalOffice;
	@CsvBindByPosition(position = 12)
	private String facilityCapacity;
	@CsvBindByPosition(position = 13)
	private String facilityStatus;
	@CsvBindByPosition(position = 14)
	private String licenseFirstDate;
	@CsvBindByPosition(position = 15)
	private String closedDate;
	@CsvBindByPosition(position = 16)
	private String lastVisitDate;
	@CsvBindByPosition(position = 17)
	private String inspectionVisits;
	@CsvBindByPosition(position = 18)
	private String complaintVisits;
	@CsvBindByPosition(position = 19)
	private String otherVisits;
	@CsvBindByPosition(position = 20)
	private String totalVisits;
	@CsvBindByPosition(position = 21)
	private String citationNumbers;
	@CsvBindByPosition(position = 22)
	private String pocDates;
	@CsvBindByPosition(position = 23)
	private String allVisitDates;
	@CsvBindByPosition(position = 24)
	private String inspectionVisitDates;
	@CsvBindByPosition(position = 25)
	private String inspectTypeA;
	@CsvBindByPosition(position = 26)
	private String inspectTypeB;
	@CsvBindByPosition(position = 27)
	private String otherVisitDates;
	@CsvBindByPosition(position = 28)
	private String otherTypeA;
	@CsvBindByPosition(position = 29)
	private String otherTypeB;
	@CsvBindByPosition(position = 30)
	private String complaintTypeA;
	@CsvBindByPosition(position = 31)
	private String complaintTypeB;
	@CsvBindByPosition(position = 32)
	private String totalAllegations;
	@CsvBindByPosition(position = 33)
	private String inconclusiveAllegations;
	@CsvBindByPosition(position = 34)
	private String substantiatedAllegations;
	@CsvBindByPosition(position = 35)
	private String unsubstantiatedAllegations;
	@CsvBindByPosition(position = 36)
	private String unfoundedAllegations;
	@CsvBindByPosition(position = 37)
	private String complaintInfoDate;
	@CsvBindByPosition(position = 38)
	private String subA;
	@CsvBindByPosition(position = 39)
	private String incA;
	@CsvBindByPosition(position = 40)
	private String unsA;
	@CsvBindByPosition(position = 41)
	private String unfA;
	@CsvBindByPosition(position = 42)
	private String typeA;
	@CsvBindByPosition(position = 43)
	private String typeB;

	
	
	/**
	 * Getter Method	: getFacilityNumber
	 * @return the facilityNumber
	 * 
	 * Date				: Feb. 23, 2022
	 */
	public String getFacilityNumber() {
		return facilityNumber;
	}



	/**
	 * Getter Method	: getFacilityName
	 * @return the facilityName
	 * 
	 * Date				: Feb. 23, 2022
	 */
	public String getFacilityName() {
		return facilityName;
	}



	/**
	 * Getter Method	: getLicensee
	 * @return the licensee
	 * 
	 * Date				: Feb. 23, 2022
	 */
	public String getLicensee() {
		return licensee;
	}



	/**
	 * Getter Method	: getFacilityAdministrator
	 * @return the facilityAdministrator
	 * 
	 * Date				: Feb. 23, 2022
	 */
	public String getFacilityAdministrator() {
		return facilityAdministrator;
	}



	/**
	 * Getter Method	: getFacilityTelephoneNumber
	 * @return the facilityTelephoneNumber
	 * 
	 * Date				: Feb. 23, 2022
	 */
	public String getFacilityTelephoneNumber() {
		return facilityTelephoneNumber;
	}



	/**
	 * Getter Method	: getFacilityAddress
	 * @return the facilityAddress
	 * 
	 * Date				: Feb. 23, 2022
	 */
	public String getFacilityAddress() {
		return facilityAddress;
	}



	/**
	 * Getter Method	: getFacilityCity
	 * @return the facilityCity
	 * 
	 * Date				: Feb. 23, 2022
	 */
	public String getFacilityCity() {
		return facilityCity;
	}



	/**
	 * Getter Method	: getFacilityState
	 * @return the facilityState
	 * 
	 * Date				: Feb. 23, 2022
	 */
	public String getFacilityState() {
		return facilityState;
	}



	/**
	 * Getter Method	: getFacilityZip
	 * @return the facilityZip
	 * 
	 * Date				: Feb. 23, 2022
	 */
	public String getFacilityZip() {
		return facilityZip;
	}



	/**
	 * Getter Method	: getCountyName
	 * @return the countyName
	 * 
	 * Date				: Feb. 23, 2022
	 */
	public String getCountyName() {
		return countyName;
	}



	/**
	 * Getter Method	: getRegionalOffice
	 * @return the regionalOffice
	 * 
	 * Date				: Feb. 23, 2022
	 */
	public String getRegionalOffice() {
		return regionalOffice;
	}



	/**
	 * Getter Method	: getFacilityCapacity
	 * @return the facilityCapacity
	 * 
	 * Date				: Feb. 23, 2022
	 */
	public String getFacilityCapacity() {
		return facilityCapacity;
	}



	/**
	 * Getter Method	: getFacilityStatus
	 * @return the facilityStatus
	 * 
	 * Date				: Feb. 23, 2022
	 */
	public String getFacilityStatus() {
		return facilityStatus;
	}



	/**
	 * Getter Method	: getLicenseFirstDate
	 * @return the licenseFirstDate
	 * 
	 * Date				: Feb. 23, 2022
	 */
	public String getLicenseFirstDate() {
		return licenseFirstDate;
	}



	/**
	 * Getter Method	: getClosedDate
	 * @return the closedDate
	 * 
	 * Date				: Feb. 23, 2022
	 */
	public String getClosedDate() {
		return closedDate;
	}



	/**
	 * Getter Method	: getLastVisitDate
	 * @return the lastVisitDate
	 * 
	 * Date				: Feb. 23, 2022
	 */
	public String getLastVisitDate() {
		return lastVisitDate;
	}



	/**
	 * Getter Method	: getInspectionVisits
	 * @return the inspectionVisits
	 * 
	 * Date				: Feb. 23, 2022
	 */
	public String getInspectionVisits() {
		return inspectionVisits;
	}



	/**
	 * Getter Method	: getComplaintVisits
	 * @return the complaintVisits
	 * 
	 * Date				: Feb. 23, 2022
	 */
	public String getComplaintVisits() {
		return complaintVisits;
	}



	/**
	 * Getter Method	: getOtherVisits
	 * @return the otherVisits
	 * 
	 * Date				: Feb. 23, 2022
	 */
	public String getOtherVisits() {
		return otherVisits;
	}



	/**
	 * Getter Method	: getTotalVisits
	 * @return the totalVisits
	 * 
	 * Date				: Feb. 23, 2022
	 */
	public String getTotalVisits() {
		return totalVisits;
	}



	/**
	 * Getter Method	: getCitationNumbers
	 * @return the citationNumbers
	 * 
	 * Date				: Feb. 23, 2022
	 */
	public String getCitationNumbers() {
		return citationNumbers;
	}



	/**
	 * Getter Method	: getPocDates
	 * @return the pocDates
	 * 
	 * Date				: Feb. 23, 2022
	 */
	public String getPocDates() {
		return pocDates;
	}



	/**
	 * Getter Method	: getAllVisitDates
	 * @return the allVisitDates
	 * 
	 * Date				: Feb. 23, 2022
	 */
	public String getAllVisitDates() {
		return allVisitDates;
	}



	/**
	 * Getter Method	: getInspectionVisitDates
	 * @return the inspectionVisitDates
	 * 
	 * Date				: Feb. 23, 2022
	 */
	public String getInspectionVisitDates() {
		return inspectionVisitDates;
	}



	/**
	 * Getter Method	: getInspectTypeA
	 * @return the inspectTypeA
	 * 
	 * Date				: Feb. 23, 2022
	 */
	public String getInspectTypeA() {
		return inspectTypeA;
	}



	/**
	 * Getter Method	: getInspectTypeB
	 * @return the inspectTypeB
	 * 
	 * Date				: Feb. 23, 2022
	 */
	public String getInspectTypeB() {
		return inspectTypeB;
	}



	/**
	 * Getter Method	: getOtherVisitDates
	 * @return the otherVisitDates
	 * 
	 * Date				: Feb. 23, 2022
	 */
	public String getOtherVisitDates() {
		return otherVisitDates;
	}



	/**
	 * Getter Method	: getOtherTypeA
	 * @return the otherTypeA
	 * 
	 * Date				: Feb. 23, 2022
	 */
	public String getOtherTypeA() {
		return otherTypeA;
	}



	/**
	 * Getter Method	: getOtherTypeB
	 * @return the otherTypeB
	 * 
	 * Date				: Feb. 23, 2022
	 */
	public String getOtherTypeB() {
		return otherTypeB;
	}



	/**
	 * Getter Method	: getComplaintTypeA
	 * @return the complaintTypeA
	 * 
	 * Date				: Feb. 23, 2022
	 */
	public String getComplaintTypeA() {
		return complaintTypeA;
	}



	/**
	 * Getter Method	: getComplaintTypeB
	 * @return the complaintTypeB
	 * 
	 * Date				: Feb. 23, 2022
	 */
	public String getComplaintTypeB() {
		return complaintTypeB;
	}



	/**
	 * Getter Method	: getTotalAllegations
	 * @return the totalAllegations
	 * 
	 * Date				: Feb. 23, 2022
	 */
	public String getTotalAllegations() {
		return totalAllegations;
	}



	/**
	 * Getter Method	: getInconclusiveAllegations
	 * @return the inconclusiveAllegations
	 * 
	 * Date				: Feb. 23, 2022
	 */
	public String getInconclusiveAllegations() {
		return inconclusiveAllegations;
	}



	/**
	 * Getter Method	: getSubstantiatedAllegations
	 * @return the substantiatedAllegations
	 * 
	 * Date				: Feb. 23, 2022
	 */
	public String getSubstantiatedAllegations() {
		return substantiatedAllegations;
	}



	/**
	 * Getter Method	: getUnsubstantiatedAllegations
	 * @return the unsubstantiatedAllegations
	 * 
	 * Date				: Feb. 23, 2022
	 */
	public String getUnsubstantiatedAllegations() {
		return unsubstantiatedAllegations;
	}



	/**
	 * Getter Method	: getUnfoundedAllegations
	 * @return the unfoundedAllegations
	 * 
	 * Date				: Feb. 23, 2022
	 */
	public String getUnfoundedAllegations() {
		return unfoundedAllegations;
	}



	/**
	 * Getter Method	: getComplaintInfoDate
	 * @return the complaintInfoDate
	 * 
	 * Date				: Feb. 23, 2022
	 */
	public String getComplaintInfoDate() {
		return complaintInfoDate;
	}



	/**
	 * Getter Method	: getSubA
	 * @return the subA
	 * 
	 * Date				: Feb. 23, 2022
	 */
	public String getSubA() {
		return subA;
	}



	/**
	 * Getter Method	: getIncA
	 * @return the incA
	 * 
	 * Date				: Feb. 23, 2022
	 */
	public String getIncA() {
		return incA;
	}



	/**
	 * Getter Method	: getUnsA
	 * @return the unsA
	 * 
	 * Date				: Feb. 23, 2022
	 */
	public String getUnsA() {
		return unsA;
	}



	/**
	 * Getter Method	: getUnfA
	 * @return the unfA
	 * 
	 * Date				: Feb. 23, 2022
	 */
	public String getUnfA() {
		return unfA;
	}



	/**
	 * Getter Method	: getTypeA
	 * @return the typeA
	 * 
	 * Date				: Feb. 23, 2022
	 */
	public String getTypeA() {
		return typeA;
	}



	/**
	 * Getter Method	: getTypeB
	 * @return the typeB
	 * 
	 * Date				: Feb. 23, 2022
	 */
	public String getTypeB() {
		return typeB;
	}



	@Override
	public String toString() {
		return "RCFE [facilityNumber=" + facilityNumber + ", facilityName=" + facilityName + ", licensee=" + licensee
				+ ", facilityAdministrator=" + facilityAdministrator + ", facilityTelephoneNumber="
				+ facilityTelephoneNumber + ", facilityAddress=" + facilityAddress + ", facilityCity=" + facilityCity
				+ ", facilityState=" + facilityState + ", facilityZip=" + facilityZip + ", countyName=" + countyName
				+ ", regionalOffice=" + regionalOffice + ", facilityCapacity=" + facilityCapacity + ", facilityStatus="
				+ facilityStatus + ", licenseFirstDate=" + licenseFirstDate + ", closedDate=" + closedDate
				+ ", lastVisitDate=" + lastVisitDate + ", inspectionVisits=" + inspectionVisits + ", complaintVisits="
				+ complaintVisits + ", otherVisits=" + otherVisits + ", totalVisits=" + totalVisits
				+ ", citationNumbers=" + citationNumbers + ", pocDates=" + pocDates + ", allVisitDates=" + allVisitDates
				+ ", inspectionVisitDates=" + inspectionVisitDates + ", inspectTypeA=" + inspectTypeA
				+ ", inspectTypeB=" + inspectTypeB + ", otherVisitDates=" + otherVisitDates + ", otherTypeA="
				+ otherTypeA + ", otherTypeB=" + otherTypeB + ", complaintTypeA=" + complaintTypeA + ", complaintTypeB="
				+ complaintTypeB + ", totalAllegations=" + totalAllegations + ", inconclusiveAllegations="
				+ inconclusiveAllegations + ", substantiatedAllegations=" + substantiatedAllegations
				+ ", unsubstantiatedAllegations=" + unsubstantiatedAllegations + ", unfoundedAllegations="
				+ unfoundedAllegations + ", complaintInfoDate=" + complaintInfoDate + ", subA=" + subA + ", incA="
				+ incA + ", unsA=" + unsA + ", unfA=" + unfA + ", typeA=" + typeA + ", typeB=" + typeB + "]";
	}
	
	
}
