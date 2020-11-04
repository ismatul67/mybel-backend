package com.enigma.mybel.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "design_interior")
//@Getter @Setter
public class DesignInterior {
    @Id
    @GeneratedValue(generator = "design_uuid")
    @GenericGenerator(name = "design_uuid",strategy = "uuid")
    private String id;
    private String theme;
    private Double price;
    private String picture;
    private String description;
    private Integer duration;

    @Transient
    @JsonBackReference("room")
    private String roomName;

    @Transient
    @JsonBackReference("vendor")
    private String idVendor;

    @ManyToOne
    @JoinColumn(name = "id_room")
    @JsonIgnoreProperties(value = {"types","designInteriors"})
    private CategoryRoom room;

    @ManyToOne
    @JoinColumn(name = "id_vendor")
    @JsonIgnore
    private Vendor vendor;

    @ManyToMany
    @JoinTable(name = "design_has_transaction",
            joinColumns = {@JoinColumn(name = "id_design")},
            inverseJoinColumns ={@JoinColumn(name = "id_transaction")})
    @JsonIgnore
    private List<Transaction> transactions;

    public DesignInterior() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getIdVendor() {
        return idVendor;
    }

    public void setIdVendor(String idVendor) {
        this.idVendor = idVendor;
    }

    public CategoryRoom getRoom() {
        return room;
    }

    public void setRoom(CategoryRoom room) {
        this.room = room;
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

    public DesignInterior(String theme, Double price, String description, Integer duration) {
        this.theme=theme;
        this.price=price;
        this.description=description;
        this.duration=duration;
    }
}
