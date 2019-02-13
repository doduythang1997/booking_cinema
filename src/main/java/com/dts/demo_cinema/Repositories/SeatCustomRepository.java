package com.dts.demo_cinema.Repositories;

import com.dts.demo_cinema.Domain.Mapping.InformationSeat;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import java.util.List;

@Repository
public class SeatCustomRepository extends BaseRepository{
    public List<InformationSeat> findAllSeatByRoom(Integer id_room){
        List<InformationSeat> informationSeatList = null;
        String sql = "select * from team2_seat a inner join team2_room b on" +
                " a.id_room = b.id_room inner join team2_screening c on" +
                " a.id_screening = c.id_screen where a.id_room = :id_room";

            Query query = this.entityManager.createNativeQuery(sql, "InformationSeat");
            query.setParameter("id_room", id_room);
            informationSeatList = query.getResultList();

        return informationSeatList;
    }
}
