package com.devsuperior.dscommerce.entities;

import jakarta.persistence.EmbeddedId;

public class OrderItem {

    private Integer quantity;
    private Double price;

    @EmbeddedId
    private OrderItemPK id = new OrderItemPK();

    public OrderItem() {

    }

    public OrderItem(Product product, Order order, Integer quantity, Double price) {
        id.setProduct(product);
        id.setOrder(order);
        this.quantity = quantity;
        this.price = price;
    }

    public Product getProduct(){
        return id.getProduct();
    }

    public void setProduct(Product product){
        id.setProduct(product);
    }

    public Order getOrder(){
        return id.getOrder();
    }

    public void setOrder(Order order){
        id.setOrder(order);
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

}
