package com.ect.ecommercespringboot.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "state")
@Data
public class States {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;
}
