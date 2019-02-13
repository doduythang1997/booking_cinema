package com.dts.demo_cinema.Services;

import com.dts.demo_cinema.Domain.Entity.RoomEntity;
import com.dts.demo_cinema.Domain.Reponse.Reponse;
import com.dts.demo_cinema.Domain.Request.CreateRoom;
import com.dts.demo_cinema.Domain.Request.DeleteRoom;
import com.dts.demo_cinema.Domain.Request.UpdateRoom;

public interface RoomServiceiplm extends BaseMovieTheaterService<RoomEntity> {
    Reponse CreateRoom(CreateRoom request);
    Reponse DeleteRoom(DeleteRoom request);
    Reponse UpdateRoom(UpdateRoom request);
}
