package com.rana;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.BootstrapServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;


public class App {
    public static void main(String[] args){

    //        used in fetch
//        Alien rana = new Alien();

    //        used in fetch
//        Alien rana = null;

    //        used in fetch
//        rana.setAid(102);
//        rana.setAname("jay");
//        rana.setColor("black");


        AlienName an = new AlienName();
        an.setFname("Ranvijay");
        an.setMname("_");
        an.setLname("Singh");


        Alien rana = new Alien();
        rana.setAid(101);
        rana.setColor("yellow");
        rana.setAname(an);



        Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Alien.class);

//        ServiceRegistry reg = new BootstrapServiceRegistryBuilder()

        SessionFactory sf =con.buildSessionFactory();

        Session session = sf.openSession();

        Transaction tx = session.beginTransaction();

        session.save(rana);

        rana = (Alien) session.get(Alien.class, 102);

        tx.commit();

        System.out.println(rana);
    }
}
