package com.nlu.shoes.repository;

import java.util.List;

import com.nlu.shoes.domain.Order;
import com.nlu.shoes.domain.User;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.CrudRepository;


public interface OrderRepository extends CrudRepository<Order, Long> {

    List<Order> findByUser(User user);

    @EntityGraph(attributePaths = { "cartItems", "payment", "shipping" })
    Order findEagerById(Long id);

}
