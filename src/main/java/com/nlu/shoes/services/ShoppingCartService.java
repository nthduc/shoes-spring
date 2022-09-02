package com.nlu.shoes.services;


import com.nlu.shoes.domain.Article;
import com.nlu.shoes.domain.CartItem;
import com.nlu.shoes.domain.ShoppingCart;
import com.nlu.shoes.domain.User;

public interface ShoppingCartService {

    ShoppingCart getShoppingCart(User user);

    int getItemsNumber(User user);

    CartItem findCartItemById(Long cartItemId);

    CartItem addArticleToShoppingCart(Article article, User user, int qty, String size);

    void clearShoppingCart(User user);

    void updateCartItem(CartItem cartItem, Integer qty);

    void removeCartItem(CartItem cartItem);

}
