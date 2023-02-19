package org.example.dao;

import lombok.Getter;
import lombok.Setter;
import org.example.model.Tickets;

public interface TicketDao {
    Tickets getById(String id);
    void delete(int id);
    void save(Tickets ticket);


}
