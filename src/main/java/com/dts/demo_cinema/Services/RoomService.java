package com.dts.demo_cinema.Services;

import com.dts.demo_cinema.Domain.Entity.RoomEntity;
import com.dts.demo_cinema.Domain.Reponse.Reponse;
import com.dts.demo_cinema.Domain.Request.CreateRoom;
import com.dts.demo_cinema.Domain.Request.DeleteRoom;
import com.dts.demo_cinema.Domain.Request.UpdateRoom;
import com.dts.demo_cinema.Repositories.RoomRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class RoomService implements RoomServiceiplm {
    @Autowired
    private RoomRepo roomRepo;
    @Override
    public Reponse CreateRoom(CreateRoom request) {
        Reponse re=new Reponse();
        try{
            RoomEntity roomEntity=new RoomEntity();
            roomEntity.setIdRoom(request.getIdRoom());
            roomEntity.setNameRoom(request.getNameRoom());
            roomEntity.setSeatNo(request.getSeatNo());
            save(roomEntity);
        }catch (Exception e){
        re.server_err();
        }
        return re;
    }

    @Override
    public Reponse DeleteRoom(DeleteRoom request) {
        Reponse reponse=new Reponse();
        try{
            RoomEntity roomEntity=findById(request.getIdRoom());
            if(roomEntity!=null){
                roomRepo.delete(roomEntity);
            }
        }catch (Exception e){
            reponse.server_err();
        }
        return reponse;
    }

    @Override
    public Reponse UpdateRoom(UpdateRoom request) {
        Reponse reponse=new Reponse();
        try{
            RoomEntity roomEntity=findById(request.getIdRoom());
            if(roomEntity!=null){
                roomEntity.setNameRoom(request.getNameRoom());
                roomEntity.setSeatNo(request.getSeatNo());
                save(roomEntity);
            }
        }catch (Exception e){
            reponse.server_err();
        }
        return reponse;
    }


    @Override
    public void save(RoomEntity roomEntity) {
        roomRepo.save(roomEntity);
    }

    @Override
    public List<RoomEntity> findAll() {
        return (List<RoomEntity>) roomRepo.findAll();
    }

    @Override
    public RoomEntity findById(Integer id) {
        Optional<RoomEntity> option=roomRepo.findById(id);
        if(option.isPresent())
            return option.get();
        return null;
    }

}
