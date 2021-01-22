package com.codegym.blog.entity;

import javax.persistence.*;
import java.util.List;

@Entity(name = "category")
public class Category {
    @Id
    private int id;

    @Column(name = "category_name")
    private String name;

    @OneToMany(mappedBy = "category", cascade = {CascadeType.REMOVE})
    private List<Blog> blogList;

    public Category() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
