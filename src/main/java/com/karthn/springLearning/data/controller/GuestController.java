package com.karthn.springLearning.data.controller;

import com.karthn.springLearning.data.entity.Guest;
import com.karthn.springLearning.data.repository.GuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/guests")
public class GuestController {

    @Autowired
    private GuestRepository guestRepository;

    @GetMapping
    private Iterable<Guest> getGuestList()
    {
        return guestRepository.findAll();
    }
}
