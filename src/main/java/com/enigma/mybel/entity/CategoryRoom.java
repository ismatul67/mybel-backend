package com.enigma.mybel.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "mst_category_room")
//@Getter @Setter
@ToString
public class CategoryRoom {
    @Id
    @GeneratedValue(generator = "category_uuid")
    @GenericGenerator(name = "category_uuid",strategy = "uuid")
    private String id;
    private String name;

    @OneToMany(mappedBy = "room")
    @JsonIgnoreProperties(value = {"room","units"})
    private List<Type> types;

    @OneToMany(mappedBy = "room")
    @JsonIgnoreProperties("room")
    private List<DesignInterior> designInteriors;

    public CategoryRoom() {
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

    public List<Type> getTypes() {
        return types;
    }

    public void setTypes(List<Type> types) {
        this.types = types;
    }

    public List<DesignInterior> getDesignInteriors() {
        return designInteriors;
    }

    public void setDesignInteriors(List<DesignInterior> designInteriors) {
        this.designInteriors = designInteriors;
    }

    public CategoryRoom(String name){
        this.name=name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CategoryRoom room = (CategoryRoom) o;
        return Objects.equals(id, room.id) &&
                Objects.equals(name, room.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}