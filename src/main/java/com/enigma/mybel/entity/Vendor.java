package com.enigma.mybel.entity;

import com.enigma.mybel.enums.Gender;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "vendor")
//@Getter @Setter
@ToString
public class Vendor {
    @Id
    @GeneratedValue( generator = "vendor_uuid")
    @GenericGenerator(name = "vendor_uuid",strategy = "uuid")
    private String id;
    private String name;
    private String username;
    private String password;
    private Gender gender;
    private String company;
    private String email;
    private String photo;
    private String address;
    private Boolean statusRequest;

    @OneToMany(mappedBy = "vendor")
    @JsonIgnoreProperties(value = {"type","vendor"})
//    @JsonIgnore
    private List<Unit> units;

    @OneToMany(mappedBy = "vendor")
//    @JsonIgnore
    private List<DesignInterior> designInteriors;

    public Vendor(String name,String username,String password,Gender gender,String company,String email,String address){
        this.name=name;
        this.username=username;
        this.password=password;
        this.gender=gender;
        this.company=company;
        this.email=email;
        this.address=address;
        this.statusRequest=false;
    }

    public Vendor() {
        this.statusRequest=false;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Boolean getStatusRequest() {
        return statusRequest;
    }

    public void setStatusRequest(Boolean statusRequest) {
        this.statusRequest = statusRequest;
    }

    public List<Unit> getUnits() {
        return units;
    }

    public void setUnits(List<Unit> units) {
        this.units = units;
    }

    public List<DesignInterior> getDesignInteriors() {
        return designInteriors;
    }

    public void setDesignInteriors(List<DesignInterior> designInteriors) {
        this.designInteriors = designInteriors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vendor vendor = (Vendor) o;
        return Objects.equals(id, vendor.id) &&
                Objects.equals(name, vendor.name) &&
                Objects.equals(username, vendor.username) &&
                Objects.equals(password, vendor.password) &&
                gender == vendor.gender &&
                Objects.equals(company, vendor.company) &&
                Objects.equals(email, vendor.email) &&
                Objects.equals(photo, vendor.photo) &&
                Objects.equals(address, vendor.address) &&
                Objects.equals(statusRequest, vendor.statusRequest);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, username, password, gender, company, email, photo, address, statusRequest);
    }
}
