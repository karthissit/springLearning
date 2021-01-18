package com.karthn.springLearning.data.repository;

import com.karthn.springLearning.data.entity.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface ReservationsRepository extends CrudRepository<Reservation, Long> {
}
