package com.dts.demo_cinema.Repositories;


import com.dts.demo_cinema.Domain.Mapping.InformationTicket;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import java.util.List;
@Repository
public class BookingCustomRepository extends BaseRepository {
    public List<InformationTicket> getInformationTicket(Integer id_ticket){
        List<InformationTicket> informationTicketList = null;
        String sql = "select a.id_ticket, a.id_screen, d.name_movie, e.name_movietheater," +
                "a.time_create, b.id_room, c.name_room, f.row_seat, f.number_seat,a.price_ticket" +
                " from team2_ticket a inner join team2_screening b on a.id_screen = b.id_screen " +
                "inner join team2_room  c on b.id_room = c.id_room inner join team2_movies d on " +
                "b.id_movie = d.id_movie inner join team2_movietheater e on b.id_screen = e.id_screen" +
                " inner join team2_seat f on f.id_screening = e.id_screen where a.id_ticket = '"+id_ticket+"'group by a.id_ticket";
        Query query = this.entityManager.createNativeQuery(sql, "InformationTicket");
        informationTicketList = query.getResultList();
        return informationTicketList;
    }

//    public boolean createTicket(Integer id_seat){
//        String sqlseat = "select a.active from team2_seat a where a.id_seat ='"+id_seat+"'";
//        Query query = this.entityManager.createNativeQuery(sqlseat);
//        int check = query.getFirstResult();
//        if (check == 0){
//            return true;
//        }
//        return false;
//    }

}
