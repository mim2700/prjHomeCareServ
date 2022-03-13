/**
 * Project				:	prjHomeCareServ
  * 
 * Author				:	Bhabesh
 * E-mail               :   bhabesh.m@gmail.com
 *
 * FrameWork			:	Spring boot 2.6 
 * 
 * File Name			:	CSVResult.java
 * Package Name			:	com.home.care.utility.csv
 * Date of creation		:	Feb. 12, 2022  9:55:43 a.m.
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

/**
 * @author bhabesh
 *
 */
public class CSVResult {
	private String 	operationName;
	private String 	strDuration;
	private int		numberOfRecords;
	private	String	serverTime;
	public String getOperationName() {
		return operationName;
	}
	public void setOperationName(String operationName) {
		this.operationName = operationName;
	}
	public String getStrDuration() {
		return strDuration;
	}
	public void setStrDuration(String strDuration) {
		this.strDuration = strDuration;
	}
	public int getNumberOfRecords() {
		return numberOfRecords;
	}
	public void setNumberOfRecords(int numberOfRecords) {
		this.numberOfRecords = numberOfRecords;
	}
	public String getServerTime() {
		return serverTime;
	}
	public void setServerTime(String serverTime) {
		this.serverTime = serverTime;
	}
	@Override
	public String toString() {
		return "CSVResult [operationName=" + operationName + ", strDuration=" + strDuration + ", numberOfRecords="
				+ numberOfRecords + ", serverTime=" + serverTime + "]";
	}
	
	

}
