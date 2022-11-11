/**
 * 
 */
package com.home.care.db;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.home.care.bo.User;

/**
 * @author bhabesh
 *
 */

@Repository
public interface UserRepo extends JpaRepository<User, Long>{
	
}
