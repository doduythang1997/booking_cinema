package com.dts.demo_cinema.Services;

import com.dts.demo_cinema.Domain.Entity.SeatEntity;
import com.dts.demo_cinema.Domain.Entity.TicketEntity;
import com.dts.demo_cinema.Domain.Mapping.InformationTicket;
import com.dts.demo_cinema.Domain.Reponse.Reponse;

import com.dts.demo_cinema.Repositories.BookingCustomRepository;
import com.dts.demo_cinema.Repositories.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import sun.security.krb5.internal.Ticket;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.List;
@Component
@Service
public class BookingService implements BaseMovieTheaterService<TicketEntity>{
    @PersistenceContext
    EntityManager entityManager;


    @Autowired
    private BookingCustomRepository bookingCustomRepository;

    @Autowired
    private TicketRepository ticketRepository;

    @Override
    public void save(TicketEntity ticketEntity) {
        ticketRepository.save(ticketEntity);
    }

    @Override
    public List<TicketEntity> findAll() {
        return null;
    }

    @Override
    public TicketEntity findById(Integer id) {
        return null;
    }

    public List<InformationTicket> getInforTicket(Integer id_ticket){
        return bookingCustomRepository.getInformationTicket(id_ticket);
    }

//    public void createTicket(Integer id_seat, CreateTicketRequest request){
//        boolean checking = bookingCustomRepository.createTicket(id_seat);
//        Reponse reponse = new Reponse();
//        Timestamp getTime = new Timestamp(Calendar.getInstance().getTime().getTime());
//
//            if (checking){
//                TicketEntity ticketEntity = new TicketEntity();
//                ticketEntity.setIdTicket(request.getIdTicket());
//                ticketEntity.setIdScreen(request.getIdScreen());
//                ticketEntity.setPriceTicket(request.getPriceTicket());
//                ticketEntity.setTimeCreate(getTime.toString());
//                save(ticketEntity);
//                SeatEntity seatEntity = new SeatEntity();
//                seatEntity.setIdSeat(seatEntity.getIdSeat());
//                seatEntity.setRowSeat(seatEntity.getRowSeat());
//                seatEntity.setIdRoom(seatEntity.getIdRoom());
//                seatEntity.setIdScreening(seatEntity.getIdScreening());
//                seatEntity.setNumberSeat(seatEntity.getNumberSeat());
//                seatEntity.setActive(1);
//                String sql = "select a.row_seat,a.number_seat from team2_seat where a.id_seat = '"+id_seat+"'";
//                Query query = this.entityManager.createNativeQuery(sql);
//                int check = query.getFirstResult();
//                if (check == 0){
//                    SeatEntity seatEntityx = new SeatEntity();
//                    seatEntityx.setNumberSeat(seatEntity.getNumberSeat()+1);
//                    seatEntityx.setActive(2);
//                    seatEntityx.setIdSeat(seatEntity.getIdSeat());
//                    seatEntityx.setRowSeat(seatEntity.getRowSeat());
//                    seatEntityx.setIdRoom(seatEntity.getIdRoom());
//                    seatEntityx.setIdScreening(seatEntity.getIdScreening());
//                }
            }

//
//    }
//}
