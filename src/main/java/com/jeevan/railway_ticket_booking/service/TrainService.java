package com.jeevan.railway_ticket_booking.service;

import com.jeevan.railway_ticket_booking.model.Train;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainService {

    public List<Train> getAllTrains() {

        return List.of(
                new Train(
                        "12627",
                        "Karnataka Express",
                        "Bangalore",
                        "Delhi"
                ),
                new Train(
                        "12007",
                        "Shatabdi Express",
                        "Bangalore",
                        "Mysore"
                )
        );
    }
}