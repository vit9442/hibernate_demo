package org.example.dao;

import org.example.model.Bookings;
import org.example.model.Tickets;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class BookingsDaoImpl implements BookingsDao {

    private SessionFactory sessionFactory;

    public BookingsDaoImpl(Configuration cfg) {
        this.sessionFactory = cfg.buildSessionFactory();
    }

    @Override
    public Bookings getById(String id) {
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        Bookings booking = session.get(Bookings.class, id);
        session.getTransaction().commit();
        return booking;
    }

    @Override
    public void delete(String id) {
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.delete(session.get(Bookings.class, id));
        session.getTransaction().commit();
    }

    @Override
    public void save(Bookings booking) {
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        
        session.save(booking);
        System.out.println("Успешно");
    }
}
