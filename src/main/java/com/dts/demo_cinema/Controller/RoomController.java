package com.dts.demo_cinema.Controller;

import com.dts.demo_cinema.Domain.Entity.RoomEntity;
import com.dts.demo_cinema.Domain.Reponse.Reponse;
import com.dts.demo_cinema.Domain.Request.CreateRoom;
import com.dts.demo_cinema.Domain.Request.DeleteRoom;
import com.dts.demo_cinema.Domain.Request.UpdateRoom;
import com.dts.demo_cinema.Services.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;

@RestController
@RequestMapping("/room")
public class RoomController {
    @Autowired
    private RoomService roomService;

    @PostMapping(value = "/create", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Reponse createroom(@RequestBody CreateRoom request){
        return roomService.CreateRoom(request);
    }

    @PutMapping(value = "/update",consumes = MediaType.APPLICATION_JSON_VALUE)
    public  Reponse Updateroom(@RequestBody UpdateRoom request){
        return  roomService.UpdateRoom(request);
    }

    @DeleteMapping(value = "/delete",consumes = MediaType.APPLICATION_JSON_VALUE)
    public Reponse DelelteRoom(@RequestBody DeleteRoom request){
        return  roomService.DeleteRoom(request);
    }

    @GetMapping(value = "/{id}",consumes = MediaType.APPLICATION_JSON_VALUE)
    public RoomEntity findbyId(@PathVariable (name = "id") int id){
        return roomService.findById(id);
    }
}
