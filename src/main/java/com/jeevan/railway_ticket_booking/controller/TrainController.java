package com.jeevan.railway_ticket_booking.controller;

import com.jeevan.railway_ticket_booking.model.Train;
import com.jeevan.railway_ticket_booking.service.TrainService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@RestController
public class TrainController {

    private final TrainService trainService;

    public TrainController(TrainService trainService) {
        this.trainService = trainService;
    }

    @GetMapping("/trains")
    public List<Train> getTrains() {
        return trainService.getAllTrains();
    }

    @PostMapping("/trains")
    public Train addTrain(@RequestBody Train train) {

        return train;
    }
}