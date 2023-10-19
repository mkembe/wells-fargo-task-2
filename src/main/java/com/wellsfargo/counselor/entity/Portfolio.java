package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioId;

    @Column(nullable = false)
    private String name;

    @ManyToOne
    private Client client;

    public Portfolio(String name, Client client) {
        this.name = name;
        this.client = client;
    }

    public Long getPortfolioId() { return portfolioId; }

    public String getName() { return name; }
    public void setName(String name) {
        this.name = name;
    }

    public Client getClient() { return client; }

    public void setClient(Client client) { this.client = client; }
}
