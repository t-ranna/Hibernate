package com.rana;

import jakarta.persistence.*;

@Entity
@Table(name="alien_tablee")

public class Alien //bean or POJO
{
    @Id
    private int aid;

    @Transient
    private String aname;

    @Column(name="alien_color")
    private String color;


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }
}
