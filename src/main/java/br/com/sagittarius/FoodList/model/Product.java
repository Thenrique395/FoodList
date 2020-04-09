package br.com.sagittarius.FoodList.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity(name = "Product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private Long IdProduct;
    private String Name;
    private String Description;
    private double price;
    private int amount;

    public Product() { }

    public Product(Long idProduct, String name, String description, double price, int amount) {
        IdProduct = idProduct;
        Name = name;
        Description = description;
        this.price = price;
        this.amount = amount;
    }
}
