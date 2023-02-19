package org.example.dao;

import org.example.model.Bookings;
import org.example.model.Tickets;

public interface BookingsDao {
    Bookings getById(String id);
    void delete(String id);
    void save(Bookings booking);
}
