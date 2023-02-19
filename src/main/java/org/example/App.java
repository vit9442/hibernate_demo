package org.example;
import org.example.dao.*;
import org.example.model.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;




public class App {
    public static void main( String[] args ) {
        Configuration cfg = new Configuration()
                .addAnnotatedClass(Bookings.class)
                .addAnnotatedClass(Tickets.class)
                .addAnnotatedClass(TicketFlights.class);




       TicketDao ticketDao = new TicketsDaoImpl(cfg);
       Tickets ticket = ticketDao.getById("0005432000860");
        System.out.println("Таблица tickets");
       System.out.printf("Ticket No: %s\nPassanger name: %s\n",ticket.getTicket_no(), ticket.getPassengerName());

      BookingsDao bookingsDao = new BookingsDaoImpl(cfg);
      Bookings bookings = bookingsDao.getById("00000F");
        System.out.println("Таблица bookings");
        System.out.printf("book ref: %s\nbook date: %s\n", bookings.getBookRef(), bookings.getBookDate());

        TicketFlightDao ticketFlightDao =  new TicketFlightDaoImpl(cfg);
        TicketFlights ticketFlights = ticketFlightDao.getById("0005432081075");
        System.out.println("Таблица ticket_flights");
        System.out.printf("Ticket No: %s\nflight id: %s\nfare condition: %s\n",ticketFlights.getTicket_no(), ticketFlights.getFlightId(), ticketFlights.getFareConditions());




    }
}
