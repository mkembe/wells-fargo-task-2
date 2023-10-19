package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

public class Security {
    @Id
    @GeneratedValue()
    private long securityId;

    @Column(nullable = false)
    private String type;
    @Column(nullable = false)
    private Integer quantity;
    @Column(nullable = false)
    private Double price;
    @Column(nullable = false)
    private Integer total;
    @Column(nullable = false)
    private String purchaseDate;
    @ManyToOne
    private Portfolio portfolio;

    public Security(String type, Integer quantity, Double price, Integer total, String purchaseDate) {
        this.type = type;
        this.quantity = quantity;
        this.price = price;
        this.total = total;
        this.purchaseDate = purchaseDate;
    }

    public Long getSecurityId() { return securityId; }

    public String getType() {return type;}
    public Integer getQuantity() {return quantity;}
    public Double getPrice() {return price;}
    public Integer getTotal() {return total;}
    public String getPurchaseDate() {return purchaseDate;}

    public void setType(String type) {this.type = type;}
    public void setQuantity(Integer quantity) {this.quantity = quantity;}
    public void setPrice(Double price) {this.price = price;}
    public void setTotal(Integer total) {this.total = total;}
    public void setPurchaseDate(String purchaseDate) {this.purchaseDate = purchaseDate;}

    public Portfolio getPortfolio() { return portfolio; }

    public void setPortfolio(Portfolio portfolio) { this.portfolio = portfolio; }



}
