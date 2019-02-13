package com.dts.demo_cinema.Repositories;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
@Component
public class BaseRepository {
    @PersistenceContext
    EntityManager entityManager;
}
