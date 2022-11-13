/**
 * 
 */
package com.home.care.db;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.home.care.bo.User;

/**
 * @author bhabesh
 *
 */

@Repository
public interface UserRepo extends JpaRepository<User, Long>{
	@Query(
			value = "select * from user where email = :strParamEmail",
			nativeQuery = true
			)
	Optional<User> findByEmail(@Param("strParamEmail") String strParamEmail);
	
}
