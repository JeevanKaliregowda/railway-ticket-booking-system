package com.jeevan.railway_ticket_booking.model;

public class Train {

    private String trainNumber;
    private String trainName;
    private String source;
    private String destination;

    public Train(String trainNumber,
                 String trainName,
                 String source,
                 String destination) {

        this.trainNumber = trainNumber;
        this.trainName = trainName;
        this.source = source;
        this.destination = destination;
    }

    public Train() {
    }

    public String getTrainNumber() {
        return trainNumber;
    }

    public String getTrainName() {
        return trainName;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }
}