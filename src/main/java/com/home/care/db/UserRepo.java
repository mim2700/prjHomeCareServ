/**
 * 
 */
package com.home.care.db;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.home.care.bo.User;
import com.home.care.bo.Userface;

/**
 * @author bhabesh
 *
 */

@Repository
public interface UserRepo extends JpaRepository<User, Long>{
	@Transactional
	@Query(
			value = "select * from user where email = :strParamEmail",
			nativeQuery = true
			)
	Optional<User> findByEmail(@Param("strParamEmail") String strParamEmail);
	
	@Query(
			value = "select firstName as firstName, lastName as lastName, email as email from User where id = :longParamId" ,
			nativeQuery = false
			)
	Optional<Userface> findByUserId(@Param("longParamId") Long longParamId);	
	
}
