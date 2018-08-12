package com.aranyacreations.ecom.model;

import java.util.Objects;

public class Product {

    private Long id;
    private String name;
    private Double price;
    private String priceUrl;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getPriceUrl() {
        return priceUrl;
    }

    public void setPriceUrl(String priceUrl) {
        this.priceUrl = priceUrl;
    }



    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", priceUrl='" + priceUrl + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {

        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Product product = (Product) o;

        return Objects.equals(id, product.id) &&
                Objects.equals(name, product.name) &&
                Objects.equals(price, product.price) &&
                Objects.equals(priceUrl, product.priceUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price, priceUrl);
    }
}
