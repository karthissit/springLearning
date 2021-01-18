package com.karthn.springLearning.data.controller;

import com.karthn.springLearning.data.entity.Reservation;
import com.karthn.springLearning.data.repository.ReservationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reservations")
public class ReservationController {

    @Autowired
    private ReservationsRepository reservationsRepository;

    @GetMapping
    private Iterable<Reservation> getReservations()
    {
        return reservationsRepository.findAll();
    }
}
