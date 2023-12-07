package com.cst438.domain;



import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


public interface LikeRepository extends 
                 CrudRepository<Like, Integer>{


//	@Query("SELECT u FROM Like u WHERE u.id =:userId")
//	List<Like> findAllLikes(@Param("userId") long id);
	
}
