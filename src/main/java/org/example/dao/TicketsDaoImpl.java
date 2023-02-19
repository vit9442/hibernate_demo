package org.example.dao;

import org.example.model.Tickets;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TicketsDaoImpl implements TicketDao {
    private SessionFactory sessionFactory;

    public TicketsDaoImpl(Configuration cfg) {
        this.sessionFactory = cfg.buildSessionFactory();
    }
    @Override
    public Tickets getById(String id){
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        Tickets ticket = session.get(Tickets.class, id);
        session.getTransaction().commit();
        return ticket;
    }

    @Override
    public void delete(int id){

    }
    @Override
    public void save(Tickets ticket){

    }

}
