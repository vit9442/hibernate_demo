package org.example.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Getter
@Setter
@Table(name = "ticket_flights")
@Entity
public class TicketFlights {
    @Id
    @Column(name = "ticket_no")
    private String ticket_no;

    @Column(name = "flight_id")
    private int flightId;
    @Column(name = "fare_conditions")
    private String fareConditions;
    @Column(name = "amount")
    private double  amount;

}
