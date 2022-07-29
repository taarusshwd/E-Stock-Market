package com.stockmarket.sectorservice.entities;

import javax.persistence.*;
//import java.util.Set;

@Entity
//@Table(name="sector")
public class Sector {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String brief;

    public Sector(){}
    public Sector(int id, String name, String brief) {
        this.id = id;
        this.name = name;
        this.brief = brief;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

//    @OneToOne(mappedBy="sector")
//    private SectorCompany sectorCompany;

}
