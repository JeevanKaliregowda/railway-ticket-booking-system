package com.jeevan.railway_ticket_booking.service;

import com.jeevan.railway_ticket_booking.model.Train;
import com.jeevan.railway_ticket_booking.repository.TrainRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainService {

    private final TrainRepository trainRepository;

    public TrainService(TrainRepository trainRepository) {
        this.trainRepository = trainRepository;
    }

    public List<Train> getAllTrains() {

        return trainRepository.findAll();
    }
}