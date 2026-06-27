package com.jeevan.railway_ticket_booking.repository;

import com.jeevan.railway_ticket_booking.model.Train;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrainRepository extends JpaRepository<Train, String> {

}