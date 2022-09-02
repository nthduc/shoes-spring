package com.nlu.shoes.services;
import com.nlu.shoes.domain.*;

import java.util.List;

public interface OrderService {

    Order createOrder(ShoppingCart shoppingCart, Shipping shippingAddress, Payment payment, User user);

    List<Order> findByUser(User user);

    Order findOrderWithDetails(Long id);
}
