package com.wellsfargo.counselor.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import java.util.List;
import jakarta.persistence.OneToMany;

@Entity
public class FinancialAdvisor1 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long advisorId;

    @Column(nullable = false)
    private String name;

    // One-to-many relationship with Client
    @OneToMany(mappedBy = "financialAdvisor1")
    private List<Client> clients;

    // Constructor
    public FinancialAdvisor1(String name) {
        this.name = name;
    }

    // Default constructor
    public FinancialAdvisor1() {}

    // Getters and Setters
    public Long getAdvisorId() {
        return advisorId;
    }

    public void setAdvisorId(Long advisorId) {
        this.advisorId = advisorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
