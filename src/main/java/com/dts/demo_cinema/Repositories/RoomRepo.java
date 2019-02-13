package com.dts.demo_cinema.Repositories;

import com.dts.demo_cinema.Domain.Entity.MoviesEntity;
import com.dts.demo_cinema.Domain.Entity.RoomEntity;
import org.springframework.data.repository.CrudRepository;

public interface RoomRepo extends CrudRepository<RoomEntity, Integer> {
}
