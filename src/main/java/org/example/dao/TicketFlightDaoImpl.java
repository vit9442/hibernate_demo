package org.example.dao;

import org.example.model.TicketFlights;
import org.example.model.Tickets;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TicketFlightDaoImpl implements TicketFlightDao {
    private SessionFactory sessionFactory;

    public TicketFlightDaoImpl(Configuration cfg) {
        this.sessionFactory = cfg.buildSessionFactory();
    }

    public TicketFlights getById(String id){
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        TicketFlights ticketFlights = session.get(TicketFlights.class, id);
        session.getTransaction().commit();
        return ticketFlights;
    }

    public void delete(int id){

    }
    public  void save(TicketFlights ticketFlights){

    }
}

