/**
 * Project				:	prjHomeCareServ
  * 
 * Author				:	Bhabesh
 * E-mail               :   bhabesh.m@gmail.com
 *
 * FrameWork			:	Spring boot 2.6 
 * 
 * File Name			:	HomeCareDbRepository.java
 * Package Name			:	com.home.care.db
 * Date of creation		:	Feb. 15, 2022  2:07:09 a.m.
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
package com.home.care.db;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.home.care.bo.RCFEData;
import com.home.care.bo.RcfeFacility;

/**
 * @author bhabesh
 *
 */
@Repository
public interface HomeCareDbRepository extends JpaRepository<RCFEData, RcfeFacility>{

}