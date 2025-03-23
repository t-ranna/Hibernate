package com.rana;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App {
    public static void main(String[] args){
        Alien rana = new Alien();
        rana.setAid(101);
        rana.setAname("ranvijay");
        rana.setColor("brown");


        Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Alien.class);

        SessionFactory sf =con.buildSessionFactory();

        Session session = sf.openSession();

        Transaction tx = session.beginTransaction();
        session.save(rana);

        tx.commit();
    }
}
