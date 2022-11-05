/**
 * 
 */
package com.home.care.db;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.core.support.DefaultCrudMethods;
import org.springframework.stereotype.Repository;

import com.home.care.bo.User;

/**
 * @author bhabesh
 *
 */
@Repository
public interface UserRepo extends CrudRepository<User, Long>{

}
