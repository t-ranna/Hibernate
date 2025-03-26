package com.rana;

import jakarta.persistence.*;

@Entity
@Table(name="alien_tablee")

public class Alien //bean or POJO
{
    @Id
    private int aid;

     //    @Transient
    private AlienName aname;


     //    used in embeddable
//    @Column(name="alien_color")


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

     //    used in embeddable
//    public String getAname() {
//    return aname;
//}
//
//    public void setAname(String aname) {
//        this.aname = aname;
//    }


    //    used in embeddable
    public AlienName getAname() {
        return aname;
    }

    public void setAname(AlienName aname) {
        this.aname = aname;
    }

    //        used in fetch
    @Override
    public String toString() {
        return "Alien{" +
                "aid=" + aid +
                ", aname='" + aname + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
