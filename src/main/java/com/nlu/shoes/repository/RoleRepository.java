package com.nlu.shoes.repository;

import com.nlu.shoes.domain.security.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<Role, Long> {

    Role findByName(String name);

}
