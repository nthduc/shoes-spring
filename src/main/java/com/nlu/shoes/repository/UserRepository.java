package com.nlu.shoes.repository;

import com.nlu.shoes.domain.User;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.EntityGraph.EntityGraphType;
import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository<User, Long>{

    @EntityGraph(value = "UserComplete", type=EntityGraphType.FETCH)
    User findByUsername(String username);

    User findByEmail(String email);

}
