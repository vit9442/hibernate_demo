package org.example.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Table(name = "tickets")
@Entity

public class Tickets {
    @Id
    @JoinColumn(name = "ticket_no", referencedColumnName = "ticket_no")
    private String ticket_no;
    @OneToOne
    @JoinColumn(name = "book_ref", referencedColumnName = "book_ref")
    private Bookings bookRef;
    @Column(name = "passenger_id")
    private String PassengerId;
    @Column(name = "passenger_name")
    private String PassengerName;

}
