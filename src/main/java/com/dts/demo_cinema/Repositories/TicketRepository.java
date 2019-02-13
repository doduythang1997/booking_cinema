package com.dts.demo_cinema.Repositories;

import com.dts.demo_cinema.Domain.Entity.TicketEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository  extends JpaRepository<TicketEntity, Integer> {
}
