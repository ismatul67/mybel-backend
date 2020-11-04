package com.enigma.mybel.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "unit")
//@Getter @Setter
public class Unit {
    @Id
    @GenericGenerator(name = "unit_uuid",strategy = "uuid")
    @GeneratedValue(generator = "unit_uuid")
    private String id;
    private String name;
    private Double price;
    private String description;
    private String picture;

    @Transient
    @JsonBackReference("vendor")
    private String idVendor;

    @Transient
    @JsonBackReference("type")
    private String idType;

    @ManyToOne
    @JoinColumn(name = "id_type")
    @JsonIgnoreProperties("types")
    private Type type;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "id_vendor")
    private Vendor vendor;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "unit_has_transaction",
            joinColumns = {@JoinColumn(name = "id_unit")},
            inverseJoinColumns = {@JoinColumn(name = "id_transaction")})
    @JsonIgnore
    private List<Transaction> transactions;

    public Unit(String name, Double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public Unit() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getIdVendor() {
        return idVendor;
    }

    public void setIdVendor(String idVendor) {
        this.idVendor = idVendor;
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Vendor getVendor() {
        return vendor;
    }

    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }
}