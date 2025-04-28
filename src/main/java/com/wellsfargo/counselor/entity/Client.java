package com.wellsfargo.counselor.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clientId;

    @Column(nullable = false)
    private String clientName;

    // Many-to-one relationship with FinancialAdvisor
    @ManyToOne
    private FinancialAdvisor1 financialAdvisor;

    // One-to-one relationship with Portfolio
    @OneToOne(mappedBy = "client")
    private Portfolio portfolio;

    // Constructor
    public Client(String clientName, FinancialAdvisor1 financialAdvisor) {
        this.clientName = clientName;
        this.financialAdvisor = financialAdvisor;
    }

    // Default constructor
    public Client() {}

    // Getters and Setters
    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public FinancialAdvisor1 getFinancialAdvisor() {
        return financialAdvisor;
    }

    public void setFinancialAdvisor(FinancialAdvisor1 financialAdvisor) {
        this.financialAdvisor = financialAdvisor;
    }
}
