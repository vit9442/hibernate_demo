package org.example.dao;

import org.example.model.TicketFlights;
import org.example.model.Tickets;

public interface TicketFlightDao {

    TicketFlights getById(String id);

    void delete(int id);
    void save(TicketFlights ticketFlights);
}
