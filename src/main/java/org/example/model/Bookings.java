package org.example.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Getter
@Setter

@Table(name = "bookings")
@Entity

public class Bookings {
    public Bookings(String id, String date, double amount){
        this.bookRef = id;
        this.bookDate = date;
        this.totalAmount = amount;
    }
    public Bookings ()
    {
    }
    @Id
    @Column(name = "book_ref")
    private String bookRef;
    @Column(name = "book_date ")
    private  String bookDate ;
    @Column(name = "total_amount")
    private  double totalAmount;
}
