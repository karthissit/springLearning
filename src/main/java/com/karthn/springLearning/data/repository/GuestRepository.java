package com.karthn.springLearning.data.repository;

import com.karthn.springLearning.data.entity.Guest;
import org.springframework.data.repository.CrudRepository;

public interface GuestRepository extends CrudRepository<Guest, Long> {
}
